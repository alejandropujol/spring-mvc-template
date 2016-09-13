package com.sirumatek.templates.springmvc.controllers;

import java.text.MessageFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sirumatek.templates.springmvc.beans.SampleBean;

@RestController
public class SampleController {

    private final Logger logger = LoggerFactory.getLogger(SampleController.class);
    
    @RequestMapping("/sample1")
    public SampleBean sample1(@RequestParam("name") String name) {
	logger.info("name = {}", name);
        return new SampleBean(MessageFormat.format("Hello {0}!", name));
    }
    
    @RequestMapping("/sample2")
    public SampleBean sample2(@RequestParam(value="name", defaultValue="World") String name) {
	logger.info("name = {}", name);
        return new SampleBean(MessageFormat.format("Hello {0}!", name));
    }
    
    @RequestMapping("/sample3")
    public SampleBean sample3(@RequestHeader("name") String name) {
	logger.info("name = {}", name);
        return new SampleBean(MessageFormat.format("Hello {0}!", name));
    }
    
    @RequestMapping("/sample4")
    public SampleBean sample4(HttpServletRequest request, HttpServletResponse response) {
	logger.info("uri = {}", request.getRequestURI());
	response.addHeader("Signature", "uifyGUfudiFYFilFuF");
        return new SampleBean(MessageFormat.format("Your URI is {0}", request.getRequestURI()));
    }

}