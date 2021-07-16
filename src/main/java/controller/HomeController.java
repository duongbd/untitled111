package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping
    public String home(){
        return "home";
    }
    @PostMapping(value = "/postCondiments")
    public String postCondiments(@RequestParam(value = "condiments", required = false) List<String> listCondiment, ModelMap modelMap){
        if (listCondiment==null){
            modelMap.addAttribute("message","No condiment be chose");
            return "home";
        }
        modelMap.addAttribute("list", listCondiment);
        return "success";
    }
}

