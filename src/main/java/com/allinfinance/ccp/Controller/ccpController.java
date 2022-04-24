package com.allinfinance.ccp.Controller;

import com.alibaba.fastjson.JSONObject;
import com.allinfinance.ccp.model.TblCcp;
import com.allinfinance.ccp.service.TblCcpService;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.sun.javafx.binding.StringFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class ccpController {
    private final static Logger logger = LoggerFactory.getLogger(ccpController.class);
    @Autowired
    private TblCcpService tblCcpService;

    @RequestMapping(value = "/find/{id}",method = RequestMethod.GET)
    public String findByPrimaryIdGet(@PathVariable String id){
        logger.info("start method: \"{}\".","findByPrimaryIdGet");
        TblCcp tblCcp;
        if( (tblCcp = tblCcpService.selectByPrimaryKey(id)) == null){
          logger.info("Do not find ,because this id :[{}],may not exists.",id);
          return "Do not find ,because this id :["+id+"],may not exists.";
        }
        logger.info("select {}",id);
        return tblCcp.toString();
    }
    @RequestMapping(value = "/find",method = RequestMethod.POST)
    public String findByPrimaryIdPost(@RequestBody JSONObject ccp){
        logger.info("start method: \"{}\".","findByPrimaryIdPost");
        TblCcp tblCcp;
        if( (tblCcp = tblCcpService.selectByPrimaryKey(ccp.getString("id"))) == null){
            logger.info("Do not find ,because this id :[{}],may not exists.",ccp.getString("id"));
            return "Do not find ,because this id :["+ccp.getString("id")+"],may not exists.";
        }
        logger.info("select {}",ccp.getString("id"));
        return tblCcp.toString();
    }
}
