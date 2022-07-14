package com.wjc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddressController {

    @RequestMapping("/address")
    @ResponseBody
    public String save() {
        System.out.println("address saving");
        return  "{'module':'springmvc'}";
    }
}
