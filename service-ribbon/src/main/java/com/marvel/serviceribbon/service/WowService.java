package com.marvel.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Marvel on 19/01/08.
 */
@Service
public class WowService {

    private final RestTemplate restTemplate;

    @Autowired
    public WowService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "wowError")
    public String wowService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/wow?name="+name,String.class);
    }

    public String wowError(String name) {
        return "Wow! " + name + ", something wrong!";
    }
}
