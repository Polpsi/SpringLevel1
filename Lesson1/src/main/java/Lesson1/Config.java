package Lesson1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Lesson1")

public class Config {

    @Bean(name = "outer2")
    public Outer outer(Inner inner) {
        return new Outer(inner);
    };

/*    @Bean(name = "inner2")
    @Scope("prototype")
    public Inner inner(){
        return new Inner();
    }*/
}
