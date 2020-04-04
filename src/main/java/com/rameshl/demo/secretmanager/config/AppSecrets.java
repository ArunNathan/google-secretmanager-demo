package com.rameshl.demo.secretmanager.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app.secrets")
public class AppSecrets {

    @Getter
    private String googleClientId;

    private String googleClientSecret;
}
