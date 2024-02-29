package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TimerBean {
    @Bean
    public Timer timer() {
        return new Timer();
    }
}
