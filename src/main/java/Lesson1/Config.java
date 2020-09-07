package Lesson1;
//Еще не доделано
//Сдал только для того, чтобы успеть по времени
//для последующего трудоустройства.

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Lesson1")

public class Config {

    @Bean(name = "outer2")
    public Outer outer(inner);
}
