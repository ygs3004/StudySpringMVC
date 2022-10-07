package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest request){
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");
        String[] data3 = request.getParameterValues("data3");

        System.out.println("data1 : "+data1);
        System.out.println("data2 : "+data2);

        for(String str1 : data3){
            System.out.println("data3 : "+str1);
        }
        return "result";
    }
}