package com.hnf.controllers;

import com.hnf.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by alexandraquintano on 3/9/17.
 */
@Controller
//@RequestMapping(value = "/home")
public class HomeController {
    User user;

    @ModelAttribute("user")
    @RequestMapping(value = {"/home","/hello", "/welcome"}, method = RequestMethod.GET)
    public User home(){
        user = new User("");
        return user;
    }

}
