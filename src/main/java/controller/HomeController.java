package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class HomeController {
    @GetMapping
    public String home() {
        return "home";
    }

    @PostMapping(value = "/uploadFile")
    public String upload(@RequestParam("file") MultipartFile file, ModelMap modelMap, HttpServletRequest request) {
        String contextPath = request.getContextPath();
        File imageFile = new File("E:\\untitled1\\src\\main\\resources\\images\\" + file.getOriginalFilename());
        try {
            if (imageFile.createNewFile()) {
                file.transferTo(imageFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        modelMap.addAttribute("file", file);
        return "success";
    }
}

