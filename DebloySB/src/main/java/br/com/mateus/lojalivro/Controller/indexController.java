package br.com.mateus.lojalivro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class indexController {
    @GetMapping("/")
    public String getIndex() {

        return "index";
    }
    
    @GetMapping("/home")
    public String getHome() {

        return "index";
    }
    
}
