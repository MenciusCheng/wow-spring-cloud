package com.marvel.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 19/01/08.
 */
@RestController("/")
public class WowController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/wow")
    public String wow(@RequestParam String name) {
        return "Wow! " + name + ", I am Eureka Client. port: " + port;
    }
}
