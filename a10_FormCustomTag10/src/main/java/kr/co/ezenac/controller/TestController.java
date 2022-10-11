package kr.co.ezenac.controller;

import kr.co.ezenac.beans.UserDataBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1(UserDataBean bean){
        bean.setUser_name("홍길동");
        bean.setUser_id("abcd");
        bean.setUser_pw("1234");
        bean.setUser_postcode("12345");
        bean.setUser_address1("주소 1번입니다.");
        bean.setUser_address2("주소 2번입니다.");

        return "test1";
    }
}
