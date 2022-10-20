package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    SqlSessionTemplate sqlSessionTemplate;

    @GetMapping("/input_data")
    public String input_data(DataBean dataBean){
        return "input_data";
    }

    @PostMapping("/input_pro")
    public String input_pro(DataBean dataBean){

        sqlSessionTemplate.insert("test_db.insert_data",dataBean);

        return "input_pro";
    }

    @GetMapping("/read_data")
    public String read_data(Model model){

        List<DataBean> list = sqlSessionTemplate.selectList("test_db.select_data");

        model.addAttribute("list", list);

        return "read_data";
    }

}
