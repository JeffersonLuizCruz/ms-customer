package com.coursespring.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@ConfigurationProperties
@Component
@Data
public class ConfigProperties implements Serializable {
    private static final long serialVersionUID = -6693110150463139990L;

    private String hostName;
    private Integer hostPort;

    @Value("${notification.email.dest}")
    private String emailDest;

    @Value("${notification.email.origin}")
    private String emailOrigin;
}
