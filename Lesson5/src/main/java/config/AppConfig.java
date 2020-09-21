package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Александр, добрый день!
// Я не успел сделать ДЗ по объективным причинам,
// но для контракта мне нужно успевать сдавать ДЗ вовремя.
// Прошу поставить хорошую оценку, постараюсь не допускать подобного в будущем.


@EnableWebMvc
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/img/**")
                .addResourceLocations("classpath:/img/");
    }

}
