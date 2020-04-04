package com.rameshl.demo.secretmanager;

import com.rameshl.demo.secretmanager.config.AppSecrets;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final AppSecrets appSecrets;

    @GetMapping("/")
    public String hello() {
        return String.format("ID: %s", appSecrets.getGoogleClientId());
    }
}
