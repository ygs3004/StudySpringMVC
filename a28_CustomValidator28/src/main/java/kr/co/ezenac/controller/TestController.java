package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.validator.DataBean1Validator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
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


    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DataBean1Validator validator1 = new DataBean1Validator();
        //binder.setValidator(validator1);
        binder.addValidators(validator1);
    }
}
