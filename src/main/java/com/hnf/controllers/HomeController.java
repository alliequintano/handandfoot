package com.hnf.controllers;

import com.hnf.models.User;
import com.hnf.store.Store;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private Store userStore;

    User user;

    @ModelAttribute("user")
    @RequestMapping(value = {"/home"}, method = RequestMethod.GET)
    public User home(){
        user = new User("");
        return user;
    }

    @ModelAttribute("user")
    @RequestMapping(value = {"/joinGame"}, method = RequestMethod.POST)
    public ModelAndView join(User user) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", user);
        userStore.saveUser(user);
        if (userStore.getUserCount() == 3) {
            modelAndView.setViewName("joinGame");
            return modelAndView;
        }
        modelAndView.setViewName("waitingRoom");
        return modelAndView;
    }

}
