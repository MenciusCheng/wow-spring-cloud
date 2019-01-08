package com.marvel.servicefeign.controller;

import com.marvel.servicefeign.service.SchedualServiceWow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 19/01/08.
 */
@RestController
public class WowController {

    private final SchedualServiceWow schedualServiceWow;

    @Autowired
    public WowController(SchedualServiceWow schedualServiceWow) {
        this.schedualServiceWow = schedualServiceWow;
    }

    @RequestMapping(value = "/wow")
    public String wow(@RequestParam String name){
        return schedualServiceWow.sayWowFromClientOne(name);
    }
}
