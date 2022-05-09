package com.ncu.appstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("developer")
public class DeveloperIndexController extends BaseController{
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        return "developer/index";
    }
}