package com.stone520.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description:
 * Author: stone-jin
 * Date: 2016/10/22
 */
@Controller
public class AdminController {

    @RequestMapping("/admin")
    public ModelAndView adminPage(){
        ModelAndView mav = new ModelAndView("pages/admin");

        return mav;
    }
}
