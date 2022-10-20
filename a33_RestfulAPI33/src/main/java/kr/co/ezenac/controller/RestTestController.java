package kr.co.ezenac.controller;

import kr.co.ezenac.beans.DataBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RestTestController {

    @GetMapping("/test2")
    public ResponseEntity<ArrayList<DataBean>> test2(){

        DataBean bean1 = new DataBean("문자열1", 100, 11.11, false);
        DataBean bean2 = new DataBean("문자열2", 200, 22.22, false);
        DataBean bean3 = new DataBean("문자열3", 300, 33.33, false);

        ArrayList<DataBean> list = new ArrayList<>();
        list.add(bean1);
        list.add(bean2);
        list.add(bean3);

        ResponseEntity<ArrayList<DataBean>> entry = new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);

        return entry;
    }
}
