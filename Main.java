import handler.RequestHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args)  {

        // 접속을 기다리는 포트번호
        int port = 8080;
        try {
            // 서버포트 8080으로 접속대기중
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server Started on port : " + port);
            while(true){
                Socket listen = serverSocket.accept();
                RequestHandler handler = new RequestHandler(listen);
                handler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
