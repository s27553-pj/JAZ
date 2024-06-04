package pl.pjatk.KatKas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {
//    public MySecondComponent(MyFirstComponent myFirstComponent){
//        System.out.println("Hello from MySecondComponent");
//        myFirstComponent.printHelloMessage();
  //  }
    public void printName(){
        System.out.println("MySecondComponent and printName");
    }
    public void printHelloMessage() {
        System.out.println("Hello from MySecondComponent from method printHelloMessage");
    }
    public MySecondComponent(@Value("${my.custom.property2:default}") String valueFromProperties){ //po : ustawia sie wartosc domyslna
        // System.out.println("Hello from MyFirstComponent");
        System.out.println(valueFromProperties);
    }
}
