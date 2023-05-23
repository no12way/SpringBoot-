package com.webstudy.controller;

import com.webstudy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/quick")
public class QuickController {

    @GetMapping("/w*y1")
    public String found(Model model){
        model.addAttribute("name","朱文峰");
        model.addAttribute("age","22");
        return "quick";
    }
    @GetMapping("/j?on")
    @ResponseBody
    public User found(){
        User zwf = new User("朱文峰", 22);
        return zwf;
    }

    @GetMapping("/add/found")
    @ResponseBody
    public List<User> foundList(){
        List<User> users = new ArrayList<>();
        users.add(new User("朱文峰",22));
        users.add(new User("朱文峰",21));
        return users;
    }

    @GetMapping("/add/{name}/{age}")
    @ResponseBody
    public User foundUser(@PathVariable("name") String name,@PathVariable("age") Integer age){
        User zwf = new User(name, age);
        return zwf;
    }

    @GetMapping("/add/found1")
    @ResponseBody
    public Integer[] foundList(Integer[] id){

        return id;
    }

}
