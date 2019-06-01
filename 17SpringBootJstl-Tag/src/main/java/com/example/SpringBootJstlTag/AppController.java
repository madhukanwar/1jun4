package com.example.SpringBootJstlTag;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class AppController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("welcome_msg",
                "welcome to microsoft corporation");
        model.addAttribute("lst",
                Arrays.asList("java","php","dot"));
        return "index";
    }

}
