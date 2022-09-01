package com.coursespring.service.impl;

import com.coursespring.model.DocumentCSV;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventServiceNotification {

    @EventListener
    public void jobEvent(DocumentCSV documentCSV){
        System.out.println("Evento realizado com sucesso!");
    }
}
