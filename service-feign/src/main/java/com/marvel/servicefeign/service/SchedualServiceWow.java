package com.marvel.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Marvel on 19/01/08.
 */
@FeignClient(value = "eureka-client", fallback = SchedualServiceWowHystric.class)
public interface SchedualServiceWow {

    @RequestMapping(value = "/wow",method = RequestMethod.GET)
    String sayWowFromClientOne(@RequestParam(value = "name") String name);
}
