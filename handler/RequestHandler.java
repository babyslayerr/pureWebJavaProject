package handler;

import controller.HttpController;

import java.io.*;
import java.net.Socket;

public class RequestHandler extends Thread{

    // 추후 수정 불가
    private final Socket socket;

    public RequestHandler(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try {
            BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
            StringBuilder requestBuilder = new StringBuilder();
            String line;
            while((line = in.readLine()) != null && !line.isEmpty()){ //http마지막 통신은 \r\n\r\n형식으로 EOF없이 끝난다. readLien은 \r\n개행문자 전까지 읽으므로 마지막 String에는 ""빈 문자열이 들어간다.
                requestBuilder.append(line).append("\r\n");
            }

            String request = requestBuilder.toString();
            System.out.println("received request : \n" + request);


            HttpController httpController = new HttpController();
            String response = httpController.handleRequest(request);

            // socket OutputStream으로 view객체 전달
            OutputStream out = socket.getOutputStream();
            System.out.println("response : \n" + response);
            out.write(response.getBytes("UTF-8"));
            out.flush();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
