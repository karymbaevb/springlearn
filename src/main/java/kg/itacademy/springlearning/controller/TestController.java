package kg.itacademy.springlearning.controller;

import kg.itacademy.springlearning.model.UserCustom;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

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

    @PostMapping("/user/create/post")
    public String createNewUser(@ModelAttribute(name = "user") UserCustom userCustom){
        //Логика сохранения нового пользователя
        System.out.println(userCustom);
        return "register";
    }
}
