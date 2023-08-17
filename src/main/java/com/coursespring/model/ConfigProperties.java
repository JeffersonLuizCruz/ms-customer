package com.coursespring.model;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties
@Component
@Data
public class ConfigProperties implements Serializable {
    private static final long serialVersionUID = -6693110150463139990L;

    private String hostName;
    private Integer hostPort;

    private String notificationEmailDest;

    private String notificationEmailOrigin;

    private String profileDevDevelopment;
    private String profileProdProduction;
}
