package com.hima.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log =
            LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String hello() {
        log.trace("trace error message");
        log.debug("debug error message");
        log.info("This log is written using SLF4J facade");
        log.warn("Warning message");
        log.error("Error message");

        log.info("JVM working directory = {}", System.getProperty("user.dir"));
        return "Hello Spring Logging!";
    }
}
