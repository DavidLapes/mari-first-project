package edu.davidacademy.mari.api.rest.controller.ping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public/ping")
public class PingController {

    @PostMapping
    public String ping() {
        return "Pinged successfully!";
    }
}
