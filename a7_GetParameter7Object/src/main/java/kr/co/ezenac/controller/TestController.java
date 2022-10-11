package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean;
import kr.co.ezenac.beans.DataBean2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3){
        String data1 = map.get("data1");
        String data2 = map.get("data2");
        String data33 = map.get("data3"); // Map은 중복될 경우 앞에 것만

        System.out.printf("data1 : %s\n", data1);
        System.out.printf("data2 : %s\n", data2);
        System.out.printf("data33 : %s\n", data33);

        // List는 중복된 이름까지 처리
        for(String str : data3){
            System.out.printf("data3 : %s\n", str);
        }
        return "result";
    }

    @GetMapping("/test2")
    //public String test2(@ModelAttribute DataBean bean1, @ModelAttribute DataBean2 bean2){
    public String test2(DataBean bean1, DataBean2 bean2){
        System.out.printf("data1 : %d\n", bean1.getData1());
        System.out.printf("data2 : %d\n", bean1.getData2());

        for(int number1 : bean1.getData3()){
            System.out.printf("data3 : %d\n", number1);
        }

        System.out.printf("bean2.data1 : %d\n", bean2.getData1());
        System.out.printf("bean2.data2 : %d\n", bean2.getData2());
        return "result";
    }

}