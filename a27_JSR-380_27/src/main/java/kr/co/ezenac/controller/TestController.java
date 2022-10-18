package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean1;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class TestController {

    @GetMapping("/input_data")
    public String input_data(DataBean1 dataBean1){
        return "input_data";
    }

    @PostMapping("/input_pro")
    public String input_pro(@Valid DataBean1 dataBean1, BindingResult result){

        if(result.hasErrors()){
            return "input_data";
        }

        return "input_success";
    }

}
