package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(Model model){
        int[] array1 = {10, 20, 30};
        // model.addAttribute("array1", array1[0]); 정상일때
        // model.addAttribute("array1", array1[5]); ArrayIndexOutOfBound
        ArrayList<String> list = null;
        list.add("문자열");  // NullPointerException
        return "test1";
    }

    // @ExceptionHandler(ArrayIndexOutOfBoundsException.class) // ArrayIndexOutOfBound 일때
    @ExceptionHandler(NullPointerException.class) // NullPointerException 일때
    public String exception1(){

        return "error1";
    }

}
