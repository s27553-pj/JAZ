package pl.pjatk.KatKas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;


@Component

public class MyFirstComponent {
    public void printHelloMessage() {
    System.out.println("Hello from MyFirstComponent from method printHelloMessage");
    }
    public void printName(){
        System.out.println("MyFirstComponent and printName");
    }
    public MyFirstComponent(@Value("${my.own.value}") String valueFromProperties){
       // System.out.println("Hello from MyFirstComponent");
        System.out.println(valueFromProperties);
    }

}
