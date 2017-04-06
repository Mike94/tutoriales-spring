package carmelo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThemeController {

    @RequestMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("home");
    }

}
