package com.crazy.springboot.controller;

import com.crazy.springboot.annotination.MyLog;
import com.crazy.springboot.entity.PersonBean;
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
    @MyLog("------------我是日志哈哈哈哈----------")
    public String index(Model model) {
        PersonBean personBean = new PersonBean();
        personBean.setId("100");
        personBean.setName("louis");

        model.addAttribute("user", personBean);

        return "index";
    }
}
