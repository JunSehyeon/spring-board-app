package kr.co.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user/info")
    public String info(){
        return null;
    }
    @GetMapping("/user/login")
    public String login(){
        return null;
    }
    @GetMapping("/user/register")
    public String register(){
        return null;
    }
    @GetMapping("/user/terms")
    public String terms(){
        return null;
    }
}
