package hello.core.lifecycle;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// 빈 생명주기 콜백 방법 1. 인터페이스 활용 (implements InitializingBean, DisposableBean)
public class NetworkClient { // 가짜 네트워크 예제

    private String url; // 접속할 서버 url

    public NetworkClient() {
        System.out.println("생성자 호출 url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작 시 호출
    public void connect() {
        System.out.println("connect = " + url);
    }

    public void call(String message) {
        System.out.println("call = " + url + " message = " + message);
    }

    // 서비스 종료 시 호출
    public void disconnect() {
        System.out.println("close = " + url);
    }

    // 외부라이브러리 적용할 때, 빈 생명주기 콜백 방법 2. 설정 정보에 초기화, 종료 메서드 지정
    // 권장 빈 생명주기 콜백 방법 3. @PostConstruct, @PreDestroy 애노테이션 지원
    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
