package com.marvel.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Marvel on 19/01/09.
 */
@RestController
public class WowController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/wow")
    public String wow() {
        return foo;
    }
}
