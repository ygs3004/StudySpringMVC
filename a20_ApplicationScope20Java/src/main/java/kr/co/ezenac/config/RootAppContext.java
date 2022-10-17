package kr.co.ezenac.config;


import kr.co.ezenac.beans.DataBean1;
import kr.co.ezenac.beans.DataBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

// 프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {

    @Bean
    @ApplicationScope
    public DataBean1 applicationBean1(){
        return new DataBean1();
    }

    @Bean("applicationBean2")
    @ApplicationScope
    public DataBean2 applicationBean2(){
        return new DataBean2();
    }

}