package com.sirumatek.templates.springmvc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSample {

    private final Logger logger = LoggerFactory.getLogger(TestSample.class);
    
    @Test
    public void test() {
	logger.info("Testing...");
	assertTrue(true);
    }

}