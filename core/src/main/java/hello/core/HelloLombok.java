package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//getter, setter 자동으로 만들어 줌.
@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("zzzz");
        System.out.println("helloLombok = " + helloLombok);
    }
}
