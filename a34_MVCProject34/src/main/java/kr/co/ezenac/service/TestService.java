package kr.co.ezenac.service;

import kr.co.ezenac.dao.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDAO dao;

    public String testMethod() {

        String str = dao.testDaoMethod();

        return str;
    }
    
}