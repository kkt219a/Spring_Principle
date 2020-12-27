package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//제외대상 선택
// 필터 타입은 annotation, class는 Configuration 정의된 것
@ComponentScan(
        //basePackages = "hello.core",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    // 수동 빈 등록 오류 컴포넌트 스캔 - (2) 중복 충돌
//    @Bean(name = "memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }
}
