package com.coursespring.service.impl;

import com.file.manipulationfile.service.Notificate;
import org.springframework.stereotype.Component;

@Component
public class NotificationEmail implements Notificate {

    @Override
    public void notification() {
        System.out.println("Notificação de email");
    }
}
