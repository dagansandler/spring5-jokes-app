package io.github.dagansandler.springjokesapp.controllers;

import io.github.dagansandler.springjokesapp.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

private JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String getJokes(Model model) {
        model.addAttribute("joke", jokesService.getJoke());

        return "chucknorris";
    }

}
