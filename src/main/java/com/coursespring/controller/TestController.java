package com.coursespring.controller;

import com.coursespring.model.ConfigProperties;
import com.coursespring.model.DocumentCSV;
import com.coursespring.service.impl.NotificationSMS;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/hello")
public class TestController {
    private NotificationSMS notificationSMS;

    @Autowired
    private ConfigProperties configProperties;
    @Qualifier(value = "message")
    private DocumentCSV sendMessage;
    @Qualifier(value = "exemploDoisDoUsoDeBean")
    private String concat;
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @GetMapping
    public DocumentCSV hello(@RequestParam MultipartFile multipartFile) {

        notificationSMS.sendSMS();

        sendMessage.setMessage(concat);

        sendMessage.setFileName(multipartFile.getName());
        sendMessage.setOriginalName(multipartFile.getOriginalFilename());

        log.debug("Message getName: {}", multipartFile.getName());
        log.debug("Message getOriginalFilename: {}", multipartFile.getOriginalFilename());

        return sendMessage;
    }

    @GetMapping("/event")
    public void event(){
        // Classe que executa o evento : EventServiceNotification
        applicationEventPublisher.publishEvent(new DocumentCSV());
    }

    @GetMapping("/props")
    public String props(){
        String concatStr = "Hostname:" + configProperties.getHostName() + "|"
                + "HostPort:" + configProperties.getHostPort() + "|"
                + "Email Destino:" + configProperties.getNotificationEmailDest() + "|"
                + "Email Origem:" + configProperties.getNotificationEmailOrigin() + "|"
                + "Tipo de perfil Dev: " + configProperties.getProfileDevDevelopment() + "|"
                + "Tipo de Perfil Prod: " + configProperties.getProfileProdProduction();

        return concatStr;
    }
}
