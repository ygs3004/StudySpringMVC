package kr.co.ezenac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

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

    @PostMapping("/test2")
    public String test2(HttpServletRequest request){
        String data1 = request.getParameter("data1");
        String data2 = request.getParameter("data2");
        String[] data3 = request.getParameterValues("data3");

        System.out.println("data1 : "+data1);
        System.out.println("data2 : "+data2);

        if (data3 != null) {
            for(String str1 : data3){
                System.out.println("data3 : "+str1);
            }
        }

        return "result";
    }

    @GetMapping("/test3")
    public String test3(WebRequest request){
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

    @GetMapping("/test4/{data1}/{data2}/{data3}")
    public String test4(@PathVariable int data1,
                        @PathVariable int data2,
                        @PathVariable int data3){
        System.out.println("data1 : "+ data1);
        System.out.println("data2 : "+ data2);
        System.out.println("data3 : "+ data3);

        int add = data1+data2+data3;
        System.out.println("add : "+add);

        return "result";
    }

    @GetMapping("/test5")
    public String test5(@RequestParam int data1,
                        @RequestParam int data2,
                        @RequestParam int[] data3){

        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);

        for(int a1 : data3){
            System.out.println("data3 : "+a1);
        }
        return "result";
    }

    @GetMapping("/test6")
    public String test6(@RequestParam(value = "data1") int value1,
                        @RequestParam(value = "data2") int value2,
                        @RequestParam(value = "data3") int[] value3){

        System.out.println("data1 : " + value1);
        System.out.println("data2 : " + value2);

        for(int a1 : value3){
            System.out.println("data3 : "+a1);
        }
        return "result";
    }

    @GetMapping("/test7")
    public String test7(@RequestParam int data1,
                        //@RequestParam int data2
                        @RequestParam(required = false) String data2 //required = false -> null 주입, int의 경우 null이 주입될 수 없으므로 error
                        ){
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);

        return "result";
    }

}