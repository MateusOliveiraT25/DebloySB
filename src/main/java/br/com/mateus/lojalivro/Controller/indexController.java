package br.com.mateus.lojalivro.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class indexController {
    @GetMapping("/")
    public ModelAndView getIndex() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    
    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }
    

@GetMapping("/livros-add")
public ModelAndView getLivroAdd() {
    ModelAndView mv = new ModelAndView("livros-add");
    return mv;
}

@GetMapping("/contato")
public ModelAndView getContato() {
    ModelAndView mv = new ModelAndView("contato");
    return mv;
}

}