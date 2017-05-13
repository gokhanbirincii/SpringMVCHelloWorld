package com.gokhan.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gokhan on 13.05.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")

    public String Home(){
        return "home";
    }
}
