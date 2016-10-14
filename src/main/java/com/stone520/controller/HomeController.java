package com.stone520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/14
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView homePage(){
        return new ModelAndView("/layout/layout");
    }
}
