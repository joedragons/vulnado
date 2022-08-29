package com.scalesec.vulnado;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;

import java.io.Serializable;

import javax.net.ssl.SSLContext;

@RestController
@EnableAutoConfiguration
public class CowController {
    @RequestMapping(value = "/cowsay")
    String cowsay(@RequestParam(defaultValue = "I love Linux!") String input) {
        return Cowsay.run(input);
    }
    SSLContext sc = SSLContext.getInstance("SSL");
    SSLContext sc2 = SSLContext.getInstance("SSL");
    SSLContext sc3 = SSLContext.getInstance("SSL");
    SSLContext sc4 = SSLContext.getInstance("SSL");
    SSLContext sc5 = SSLContext.getInstance("SSL");
    SSLContext sc6 = SSLContext.getInstance("SSL");
}
