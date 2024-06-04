package pl.pjatk.KatKas;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {
    public MyThirdComponent(ApplicationContext applicationContext){
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        myFirstComponent.printHelloMessage();
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent",MySecondComponent.class);
        mySecondComponent.printHelloMessage();
    }
}
