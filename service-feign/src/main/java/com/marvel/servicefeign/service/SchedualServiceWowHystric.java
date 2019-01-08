package com.marvel.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Created by Marvel on 19/01/08.
 */
@Component
public class SchedualServiceWowHystric implements SchedualServiceWow {

    @Override
    public String sayWowFromClientOne(String name) {
        return "Wow! " + name + ", something wrong!";
    }
}
