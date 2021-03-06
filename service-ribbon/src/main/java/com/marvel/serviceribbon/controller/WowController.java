package com.marvel.serviceribbon.controller;

import com.marvel.serviceribbon.service.WowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 19/01/08.
 */
@RestController
public class WowController {

    private final WowService wowService;

    @Autowired
    public WowController(WowService wowService) {
        this.wowService = wowService;
    }

    @RequestMapping(value = "/wow")
    public String wow(@RequestParam String name){
        return wowService.wowService(name);
    }
}
