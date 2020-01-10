package com.firman.rumahmakan.sunda.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HalloSotoMie {

    @GetMapping("/halloSotoMie")
    ResponseEntity halloSotoMie() {
        log.debug("I Want Soto Mie  with rice");
        return ResponseEntity.ok().body("Yeeey, you got Soto Mie");
    }
}
