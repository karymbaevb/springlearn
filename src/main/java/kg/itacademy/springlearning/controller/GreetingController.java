//package kg.itacademy.springlearning.controller;
//
//import kg.itacademy.springlearning.model.UserCustom;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping(value = "root")
//public class GreetingController {
//
//    @GetMapping(value = "/level1")
//    public String getGreeting(Model model,
//                              @RequestParam(value = "firstname", defaultValue = "World") String firstname,
//                                @RequestParam(value ="lastname", defaultValue = "") String lastname){
//        model.addAttribute("firstname", firstname);
//        model.addAttribute("lastname", lastname);
//        return "greeting";
//    }
//
//    @GetMapping(value = "/register")
//    public String getGreeting(){
//        return "register";
//    }
//
//    @PostMapping(value = "/register")
//    public String postUser(Model model, @ModelAttribute("user") UserCustom userCustom){
//        model.addAttribute("firstname", "anon");
//        model.addAttribute("lastname", "anon");
//        return "greeting";
//    }
//}
