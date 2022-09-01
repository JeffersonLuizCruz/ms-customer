package com.coursespring.model;

import com.coursespring.service.Notificate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotificationSMS{

    Notificate notificate;

    public void sendSMS(){
        notificate.notification();
    }
}
