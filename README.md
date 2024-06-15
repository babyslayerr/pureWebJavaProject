# Java HTTP 서버 프로젝트

이 프로젝트는 Java로 구현된 간단한 HTTP 서버입니다. 서버는 지정된 포트에서 들어오는 HTTP 요청을 듣고 기본 HTML 페이지로 응답합니다. 이 프로젝트는 Java의 소켓 프로그래밍, 멀티스레딩 및 HTTP 프로토콜 처리의 기본 개념을 보여줍니다.

## 프로젝트 구조

- `Main.java`: 서버의 진입점입니다. 서버 소켓을 설정하고 들어오는 연결을 대기합니다.
- `RequestHandler.java`: 개별 클라이언트 요청을 처리하는 스레드입니다. HTTP 요청을 읽고 HTTP 응답을 보냅니다.
- `HttpController.java`: 들어오는 요청에 따라 HTTP 응답을 생성하는 로직을 포함하고 있습니다.

## 시작하기

### 필요 조건

- Java Development Kit (JDK) 11 이상

### 컴파일 및 실행

1. **Java 파일 컴파일**:
    ```bash
    javac Main.java handler/RequestHandler.java controller/HttpController.java
    ```

2. **서버 실행**:
    ```bash
    java Main
    ```

3. **서버에 접근**:
   웹 브라우저를 열고 `http://localhost:8080`으로 이동합니다. "hello HTML"이라는 텍스트가 포함된 간단한 HTML 페이지를 볼 수 있습니다.

## 예제 출력

브라우저에서 `http://localhost:8080`에 접속하면 서버는 다음과 같이 응답합니다:

```html
<!DOCTYPE html>
<html>
<head>
</head>
<body>
hello HTML
</body>
</html>


## 배운 점

소켓 프로그래밍: ServerSocket 및 Socket 클래스를 사용하여 서버 소켓을 설정하고 클라이언트 연결을 처리하는 경험을 쌓았습니다.
멀티스레딩: Thread 클래스를 사용하여 여러 클라이언트 요청을 동시에 처리하는 멀티스레딩을 구현했습니다.
HTTP 프로토콜: HTTP 요청 및 응답의 구조에 대해 배우고 이를 파싱하고 생성하는 방법을 익혔습니다.
문자 인코딩: 네트워크 통신에서 UTF-8 인코딩을 처리하는 것의 중요성을 이해했습니다. 특히 HTTP 헤더 및 본문을 다룰 때 유용했습니다.
