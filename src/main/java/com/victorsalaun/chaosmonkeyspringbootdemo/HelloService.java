package com.victorsalaun.chaosmonkeyspringbootdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    private static final Logger logger = LogManager.getLogger(HelloService.class);

    private final HelloRepository helloRepository;

    @Autowired
    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public String returnHello() {
        logger.info("returnHello");
        helloRepository.dummyCall();
        return "Greetings from Spring Boot!";
    }

}
