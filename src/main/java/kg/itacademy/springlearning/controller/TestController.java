package kg.itacademy.springlearning.controller;

import kg.itacademy.springlearning.model.UserCustom;
import kg.itacademy.springlearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/create/post")
    public String createNewUser(@ModelAttribute(name = "user") UserCustom userCustom){
        userService.createNewUser(userCustom);
        userService.getUser(1);
        return "register";
    }

    @GetMapping("/{lastname}")
    public String getGreeting(Model model, @RequestParam(name = "name") String name,
                              @PathVariable(name = "lastname") String lastname){
        model.addAttribute("firstname", name);
        model.addAttribute("lastname", lastname);
        return "greeting";
    }

    @GetMapping("/user/create")
    public String createUser(){
        return "register";
    }


}
