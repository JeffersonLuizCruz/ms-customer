package com.coursespring.config;

import com.coursespring.model.DocumentCSV;
import com.coursespring.service.Notificate;
import com.coursespring.service.impl.NotificationSMS;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NoteficationConfig {

    @Bean
    NotificationSMS sendSMS(Notificate notificate){
        return new NotificationSMS(notificate);
    }

    @Bean
    DocumentCSV message(){
        DocumentCSV documentCSV = new DocumentCSV();
        documentCSV.setName("Jefferson Luiz");
        documentCSV.setAge(31);
        return documentCSV;
    }

    @Bean(name = "exemploDoisDoUsoDeBean")
    String messageconcat(){

        return "Estudo do uso das Anotation Bean e Configuration";
    }
}
