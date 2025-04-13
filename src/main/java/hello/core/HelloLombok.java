package hello.core;

import hello.core.order.OrderServiceImpl;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter // 게터세터 자동 생성
@ToString // HelloLombok(name=Lombok, age=0)
public class HelloLombok { // Lombok 예시

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Lombok");
        
        String name = helloLombok.getName();
        System.out.println("name = " + name);

        System.out.println("helloLombok = " + helloLombok);
    }
}
