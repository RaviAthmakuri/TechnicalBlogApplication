package technicalblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.model.User;

@Controller
public class UserController {

    @RequestMapping("users/login")
    public String login(){
        return "users/login";
    }

    @RequestMapping("users/registration")
    public String registration(){
        return  "users/registration";
    }

    @RequestMapping(value ="users/login",method = RequestMethod.POST)
    public String loginUser(User user){
//        System.out.println(user.getUsername() + ":" + user.getPassword());

      return "redirect:/posts";

    }

    @RequestMapping(value = "users/logout",method = RequestMethod.POST)
    public String logoutUser(){
        return "redirect:/";
//        return "index";
    }
}
