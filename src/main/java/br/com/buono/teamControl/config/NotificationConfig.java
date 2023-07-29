package br.com.buono.teamControl.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.Instant;

//@Configuration
//@EnableScheduling
public class NotificationConfig {

    //@Scheduled(fixedDelay = 1000)
    private void processNotification(){
        System.out.println("Date now"+ Instant.now());
    }
}
