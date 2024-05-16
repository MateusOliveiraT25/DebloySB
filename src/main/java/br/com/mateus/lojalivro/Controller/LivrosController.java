package br.com.mateus.lojalivro.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.mateus.lojalivro.Model.Livro;
import br.com.mateus.lojalivro.Repository.LivroRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RestController
public class LivrosController {
    
    @Autowired
    LivroRepository livrosRepository;

    @GetMapping("/livros-list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("livros-list");
        mv.addObject("livros", livrosRepository.findAll());
        return mv; 
    }

    @PostMapping("/livros-add")
    public ModelAndView create(@RequestBody Livro livro) {
        ModelAndView mv = new ModelAndView("livros-add");
        livrosRepository.save(livro);
         this.livrosRepository.save(livro);
         mv.setViewName("redirect:/livro-list");
         return mv; 
    }
}