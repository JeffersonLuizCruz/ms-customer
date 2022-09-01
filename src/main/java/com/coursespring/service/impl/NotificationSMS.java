package com.coursespring.service.impl;

import com.coursespring.service.Notificate;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class NotificationSMS{

    Notificate notificate;

    public void sendSMS(){
        notificate.notification();
    }
}
