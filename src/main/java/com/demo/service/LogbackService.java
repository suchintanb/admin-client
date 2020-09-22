package com.demo.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LogbackService {
    private static Logger logger = LogManager.getLogger();
    public void performSomeTask(){
        logger.debug("This is a debug message for service package");
        logger.info("This is an info message for service package");
        logger.warn("This is a warn message for service package");
        logger.error("This is an error message for service package");
        logger.fatal("This is a fatal message for service package");
    }
}