package com.wjc.controller;

import com.wjc.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String save() {
        System.out.println("User saving");
        return "{'module':'springmvc'}";
    }

   @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        System.out.println("User deleting");
        return "{'module':'springmvc'}";
    }

    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("User updating:" + user);
        return "{'module':'springmvc'}";
    }

    @GetMapping("/{id}")
    public String getByID(@PathVariable int id)
    {
        System.out.println("get user:"+id);
        return "{'module':'springmvc'}";
    }

    @GetMapping
    public String getAll()
    {
        System.out.println("get all users");
        return "{'module':'springmvc'}";
    }


}
