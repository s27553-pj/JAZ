package pl.pjatk.KatKas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PizzaConfiguration {
    @Bean
    public Pizza pizza(){
        return new Pizza();
    }
    @Bean
    public List<String> defaultData(){
        return List.of("q","b","c","d","e");
    }
}
