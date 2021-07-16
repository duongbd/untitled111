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
    public String home() {
        return "home";
    }

    @PostMapping(value = "/add")
    public String add(@RequestParam(value = "number1", defaultValue = "0") Float number1, @RequestParam(value = "number2", defaultValue = "0") Float number2, ModelMap modelMap) {
        modelMap.addAttribute("number1", number1);
        modelMap.addAttribute("number2", number2);
        modelMap.addAttribute("result", number1 + number2);
        return "home";
    }

    @PostMapping(value = "/sub")
    public String sub(@RequestParam(value = "number1", defaultValue = "0") Float number1, @RequestParam(value = "number2", defaultValue = "0") Float number2, ModelMap modelMap) {
        modelMap.addAttribute("number1", number1);
        modelMap.addAttribute("number2", number2);
        modelMap.addAttribute("result", number1 - number2);
        return "home";
    }

    @PostMapping(value = "/mul")
    public String mul(@RequestParam(value = "number1", defaultValue = "0") Float number1, @RequestParam(value = "number2", defaultValue = "0") Float number2, ModelMap modelMap) {
        modelMap.addAttribute("number1", number1);
        modelMap.addAttribute("number2", number2);
        modelMap.addAttribute("result", number1 * number2);
        return "home";
    }

    @PostMapping(value = "/div")
    public String div(@RequestParam(value = "number1", defaultValue = "0") Float number1, @RequestParam(value = "number2", defaultValue = "0") Float number2, ModelMap modelMap) {
        modelMap.addAttribute("number1", number1);
        modelMap.addAttribute("number2", number2);
        if (number2 == 0) {
            modelMap.addAttribute("message", "Div for 0");
        } else
            modelMap.addAttribute("result", number1 / number2);
        return "home";
    }
}

