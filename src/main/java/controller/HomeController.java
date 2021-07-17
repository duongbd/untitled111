package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping()
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "home";
    }
    @PostMapping(value = "/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee, ModelMap modelMap){
        modelMap.addAttribute("id",employee.getId());
        modelMap.addAttribute("name", employee.getName());
        modelMap.addAttribute("contactNumber", employee.getContactNumber());
        return "success";
    }
}