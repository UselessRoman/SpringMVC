package com.wjc.controller;

import com.wjc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("User saving");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("User deleting");
        return "{'module':'springmvc'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name) {
        System.out.println("普通参数传递 name ==> " + name);
        return "{'module':'commonParam'}";
    }

    @RequestMapping("/domainParam")
    @ResponseBody
    public String domainParam(@RequestBody User user)
    {
        System.out.println(user);
        return user.toString();
    }

    @RequestMapping("/listDomainParam")
    @ResponseBody
    public String listDomainParam(@RequestBody List<User> users)
    {
        System.out.println(users);
        return "success";
    }

}
