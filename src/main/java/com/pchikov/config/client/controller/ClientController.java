package com.pchikov.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

    @Value("${greeting}")
    String greeting;

    @GetMapping("/client")
    public ResponseEntity seeAnyAnimal() {
        return ResponseEntity.ok(greeting);
    }
}
