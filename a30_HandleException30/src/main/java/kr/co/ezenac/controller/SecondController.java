package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class SecondController {

    @GetMapping("/test2")
    public String test2(){

        ArrayList<String> list = null;
        list.add("문자열");  // NullPointerException

        return "test2";
    }

}
