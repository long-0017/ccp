package com.allinfinance.ccp.Controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ccpController {

    @RequestMapping(value = "/find",method = RequestMethod.POST)
    @ResponseBody
    public String find(@RequestBody JSONObject request){

        return request.getString("name");
    }
}
