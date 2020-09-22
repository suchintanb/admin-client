package com.demo.business;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LogbackBusiness {
    private static Logger logger = LogManager.getLogger();
    public void performSomeTask(){
    	int i = 10;
        logger.debug("This is a debug message for business package {}", i);
        logger.info("This is an info message for business package");
        logger.warn("This is a warn message for business package");
        logger.error("This is an error message for business package");
        logger.fatal("This is a fatal message for business package");
    }
}