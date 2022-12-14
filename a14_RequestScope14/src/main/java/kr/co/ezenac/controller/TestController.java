package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(HttpServletRequest request){
        request.setAttribute("data1", "문자열1");

       // return "redirect:result1"; // request 객체가 소멸되어 값 저장 사라짐
        return "forward:result1"; // 서버내 이동으로 값 전달 가능
    }

    @GetMapping("/result1")
    public String result1(HttpServletRequest request){

        String data1 = (String) request.getAttribute("data1");
        System.out.printf("data1 : %s\n", data1);
        return "result1";
    }

    @GetMapping("/test2")
    public String test2(Model model){
        model.addAttribute("data2", "문자열2");
        return "forward:result2";
    }

    @GetMapping("/result2")
    public String result2(HttpServletRequest request){

        String data2 = (String) request.getAttribute("data2");
        System.out.printf("data2 : %s\n", data2);
        return "result2";
    }

    @GetMapping("/test3")
    public ModelAndView test3(ModelAndView mv){
        mv.addObject("data3", "문자열3");
        mv.setViewName("forward:/result3");

        return mv;
    }

    @GetMapping("/result3")
    public String result3(HttpServletRequest request){

        String data3 = (String) request.getAttribute("data3");
        System.out.printf("data3 : %s\n", data3);
        return "result3";
    }

    @GetMapping("/test4")
    public String test4(Model model){

        DataBean1 bean1 = new DataBean1();
        bean1.setData1("문자열4");
        bean1.setData2("문자열5");
        model.addAttribute("bean1", bean1);

        return "forward:/result4";
    }

    @GetMapping("/result4")
    public String result4(HttpServletRequest request){

        DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
        System.out.printf("bean1.data1 : %s\n", bean1.getData1());
        System.out.printf("bean1.data2 : %s\n", bean1.getData2());

        return "result4";
    }

    @GetMapping("/test5")
    public String test5(@ModelAttribute("bean1") DataBean1 bean1){ // ModelAtrribute를 명시해주지 않으면 result5에서 받을수 없음
        bean1.setData1("문자열6");
        bean1.setData1("문자열7");

        return "forward:/result5";
    }

    @GetMapping("/result5")
    public String result5(HttpServletRequest request){
        DataBean1 bean1 = (DataBean1)request.getAttribute("bean1");
        System.out.printf("bean1.data1 : %s\n", bean1.getData1());
        System.out.printf("bean1.data2 : %s\n", bean1.getData2());

        return "result5";
    }

}