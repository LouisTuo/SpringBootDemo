package com.crazy.springboot_demo.controller;

import com.crazy.springboot_demo.entity.PersonBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO
 *
 * @author jaclon
 * @date 2019/6/9 0:45
 */
@Controller
@RequestMapping(value = "thymeleaf")
public class IndexController {

    @RequestMapping(value ="index", method = RequestMethod.GET)
    public String index(Model model) {
        PersonBean personBean = new PersonBean();
        personBean.setId("100");
        personBean.setName("louis");

        model.addAttribute("user", personBean);
        return "index";
    }
}
