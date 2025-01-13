package guru.springframework.spring5_recipe_app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("some message to say ...1234777777");
        return "index";
    }
}
