package kr.co.ezenac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class TestController {
    // MessageSource를 주입받는다.
    @Autowired
    ReloadableResourceBundleMessageSource res;

    @GetMapping("/test1")
    //public String test1() {
    //public String test1(Model model) {
    public String test1(Model model, Locale locale){

        System.out.printf("locale : %s\n", locale);

        String a1 = res.getMessage("aaa.a1", null, null);
        String b1 = res.getMessage("bbb.b1", null, null);

        Object[] args = {30, "홍길동"};
        String a2 = res.getMessage("aaa.a2", args, null);

        String a3 = res.getMessage("aaa.a3", null, locale);

        System.out.printf("aaa.a1 : %s\n", a1);
        System.out.printf("bbb.a1 : %s\n", b1);

        System.out.printf("aaa.a2 : %s\n", a2);
        System.out.printf("aaa.a3 : %s\n", a3);

        model.addAttribute("args",args);
        return "/test1";
    }
}
