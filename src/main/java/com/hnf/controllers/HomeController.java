package com.hnf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexandraquintano on 3/9/17.
 */
@Controller
//@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

}
