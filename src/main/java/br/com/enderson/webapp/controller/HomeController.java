package br.com.enderson.webapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(name="inicio", value="/")
    public String inicio(Model model){

        return "home/index";

    }
    @RequestMapping(name="turmas", value="/turmas")
    public String turmas(Model model){
        return "home/turmas";

    }

    @RequestMapping(name="alunos", value="/alunos")
    public String alunos(Model model){
        return "home/alunos";
    }

    @RequestMapping(name="disciplinas", value="/disciplinas")
    public String disciplinas(Model model){
        return "home/disciplinas";
    }

    @RequestMapping(name="contato", value="/contato")
    public String contato(Model model){
        return "home/contato";
    }
}

