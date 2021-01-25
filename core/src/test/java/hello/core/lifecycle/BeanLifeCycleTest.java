package hello.core.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class BeanLifeCycleTest {

    @Test
    public void lifeCycleTest(){
        System.out.println("BeanLifeCycleTest.lifeCycleTest");
        ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        System.out.println("BeanLifeCycleTest.lifeCycleTest2");
        NetworkClient client = ac.getBean(NetworkClient.class);
        System.out.println("BeanLifeCycleTest.lifeCycleTest3");
        ac.close(); // 스프링 컨테이너 종료, ConfigurableApplicationContext 필요
    }

    @Configuration
    static class LifeCycleConfig{
        //@Bean(initMethod = "init", destroyMethod = "close")
        @Bean
        public NetworkClient networkClient(){
            NetworkClient networkClient = new NetworkClient();
            System.out.println("LifeCycleConfig.networkClient");
            networkClient.setUrl("http://hello-spring.dev");
            System.out.println("LifeCycleConfig.networkClient2");
            return networkClient;
        }
    }
}
