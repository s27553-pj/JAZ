package pl.pjatk.KatKas;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix ="my.own",name="value",havingValue="true")

public class MyConditionalBean {
    public MyConditionalBean(){
        System.out.println("utworzono");
    }
}
