package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(DataBean bean, Model model){
        bean.setA1("data2");
        bean.setA2("data2");
        bean.setA3("data2");
        bean.setA4("data2");
        return "test1";
    }

}