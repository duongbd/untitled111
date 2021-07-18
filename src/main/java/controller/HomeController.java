package controller;

import dao.UserDao;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping
    public String home(ModelMap modelMap){
        modelMap.addAttribute("login", new User());
        return "home";
    }
    @PostMapping(value = "/login")
    public String login(@ModelAttribute("login") User user, ModelMap modelMap){
        User real=UserDao.checkLogin(user);
        if (real==null) {
         modelMap.addAttribute("message","wrong account or password");
            return "home";
        }
        else
            modelMap.addAttribute("message", "Hi, "+ user.getAccount());
        return "success";
    }
}

