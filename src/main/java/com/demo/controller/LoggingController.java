package com.demo.controller;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.business.LogbackBusiness;
import com.demo.service.LogbackService;

@RestController

public class LoggingController {
    private Log log = LogFactory.getLog(LoggingController.class);
 
    @RequestMapping("/log")
    public String log() {
        log.trace("This is a TRACE level message");
        log.debug("This is a DEBUG level message");
        log.info("This is an INFO level message");
        log.warn("This is a WARN level message");
        log.error("This is an ERROR level message");
        LogbackService logbackService=new LogbackService();
        logbackService.performSomeTask();
        LogbackBusiness logbackBusiness = new LogbackBusiness();
        logbackBusiness.performSomeTask();
        return "See the log for details";
    }
    @GetMapping("/employees/{id}")
    String one(@PathVariable Long id) {

      return id.toString();
    }
}