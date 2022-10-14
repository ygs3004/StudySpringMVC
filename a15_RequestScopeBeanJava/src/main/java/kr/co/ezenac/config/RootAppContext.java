package kr.co.ezenac.config;

import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

// 프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {

    @Bean
    @RequestScope
    public DataBean1 dataBean1(){
        return new DataBean1();
    }

    @Bean("requestBean2")
    @RequestScope
    public DataBean2 dataBean2(){
        return new DataBean2();
    }

}