package controller;

public class HttpController {

    private String indexPage = "<!DOCTYPE html>" +
            "<html>" +
            "<head>" +
            "</head>" +
            "<body>" +
            "hello HTML" +
            "</body>" +
            "</html>";

    // \r\n은 캐리지 리턴으로 \r은 커서를라인의 처음으로 \n는 커서를 다음라인으로 이동한다
    // http 프로토콜은 \r\n로 줄바꿈을 표현한다
    // http요청의 마지막은 빈줄로 표현되며\r\n이 두번 반복된다.
    private String httpStatus = "HTTP/1.1 200 OK\r\n" +
            "Content-Type: text/html; charset=UTF-8\r\n"+
            "Content-Length: " + indexPage.getBytes().length + "\r\n" +
            "\r\n"; // 헤더와 본문을 구분

    public String handleRequest(String request){
        //TODO request를 이용한 url분기처분은 후에 구현
        return httpStatus + indexPage;
    }
}
