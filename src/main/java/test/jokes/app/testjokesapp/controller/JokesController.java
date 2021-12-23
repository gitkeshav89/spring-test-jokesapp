package test.jokes.app.testjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.jokes.app.testjokesapp.services.JokesService;

@Controller
public class JokesController {
    
    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }
   
    @RequestMapping({"/",""})
    public String showJokes(Model model){
        model.addAttribute("jokes", this.jokesService.getJokes());
        return "index";        
    }
}
