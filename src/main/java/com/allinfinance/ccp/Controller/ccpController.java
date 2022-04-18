package com.allinfinance.ccp.Controller;

import com.allinfinance.ccp.model.TblCcp;
import com.allinfinance.ccp.service.TblCcpService;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.javafx.binding.StringFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ccpController {
    private final static Logger logger = LoggerFactory.getLogger(ccpController.class);
    @Autowired
    private TblCcpService tblCcpService;

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public String findByPrimaryId(@PathVariable String id){
        logger.info("start method: \"{}\".","findByPrimaryId");
        TblCcp tblCcp;
        if( (tblCcp = tblCcpService.selectByPrimaryKey(id)) == null){
          logger.info("Do not find ,because this id :[{}],may not exists.",id);
          return "Do not find ,because this id :["+id+"],may not exists.";
        }
        logger.info("select {}",id);
        return tblCcp.toString();
    }
}
