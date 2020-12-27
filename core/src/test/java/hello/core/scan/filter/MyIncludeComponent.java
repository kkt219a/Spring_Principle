package hello.core.scan.filter;

import java.lang.annotation.*;

// ㅌㅏ입은 클래스 레벨에 붙기..?
// annotation 생성, 아래는 공부해야할 듯
// 얘가 붙은 건 컴포넌트 스캔에 추가하겠다는 말
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
