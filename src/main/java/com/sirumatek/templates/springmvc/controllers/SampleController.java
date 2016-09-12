package com.sirumatek.templates.springmvc.controllers;

import java.text.MessageFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sirumatek.templates.springmvc.beans.SampleBean;

@RestController
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(SampleController.class);
    
    @RequestMapping("/sample")
    public SampleBean sample(@RequestParam(value="name", defaultValue="World") String name) {
	logger.info("Invoking /sample?name={}", name);
	
        return new SampleBean(MessageFormat.format("Hello {0}!", name));
    }

}