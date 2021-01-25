package hello.core.lifecycle;


import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;
    public NetworkClient(){
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        System.out.println("NetworkClient.setUrl");
        this.url = url;
    }

    public void connect(){
        System.out.println("connect: " + url);
    }
    public void call(String message){
        System.out.println("call: "+url + " message: " + message);
    }
    public void disconnect(){
        System.out.println("close: " + url);
    }

//    //의존관계 주입이 끝나면 실행해주겠다!!!
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("NetworkClient.afterPropertiesSet");
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    //빈이 종료될 때 호출!!
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("NetworkClient.destroy");
//        disconnect();
//    }

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
