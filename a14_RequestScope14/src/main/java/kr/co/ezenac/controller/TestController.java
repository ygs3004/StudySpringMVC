package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest request){
        request.setAttribute("data1", "문자열1");

        return "redirect:/result1";
    }

    @GetMapping("/result1")
    public String result1(HttpServletRequest request){

        String data1 = (String) request.getAttribute("data1");
        System.out.printf("data1 : %s\n", data1);
        return "/result1";
    }
}