package com.firman.rumahmakan.padang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HalloRendang {

    @GetMapping("/halloRendang")
    ResponseEntity halloRendang() {
        log.debug("I Love Rendang 3000x");
        return ResponseEntity.ok().body("Yeeey, you got Rendang");
    }
}
