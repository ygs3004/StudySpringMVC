package kr.co.ezenac.config;

import kr.co.ezenac.interceptor.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.*;

// Spring MVC 프로젝트에 관련된 설정을 하는 클래스
@Configuration
// Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc
//스캔할 패키지를 지정한다.
@ComponentScan(basePackages = "kr.co.ezenac.controller")
@ComponentScan(basePackages = "kr.co.ezenac.beans")
public class ServletAppContext implements WebMvcConfigurer {
    // Controller의 메서드가 반환하는 jsp의 이름 앞뒤에 확장자를 붙여주도록 한다.

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        WebMvcConfigurer.super.configureViewResolvers(registry);
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    // 정적 파일의 경로를 매핑한다.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        WebMvcConfigurer.super.addResourceHandlers(registry);
        registry.addResourceHandler("/**").addResourceLocations("/resources/");
    }

    /*
    //Properties 파일을 Message로 사용하기 위한 bean
    //properties 파일을 Message로 등록한다.
    @Bean
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource res = new ReloadableResourceBundleMessageSource();
        res.setBasename("/WEB-INF/properties/error_message");
        return res;
    }
    */

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(registry);

        TestInterceptor1 inter1 = new TestInterceptor1();
        TestInterceptor2 inter2 = new TestInterceptor2();
        TestInterceptor3 inter3 = new TestInterceptor3();
        TestInterceptor4 inter4 = new TestInterceptor4();
        TestInterceptor5 inter5 = new TestInterceptor5();
        TestInterceptor6 inter6 = new TestInterceptor6();
        TestInterceptor7 inter7 = new TestInterceptor7();
        TestInterceptor8 inter8 = new TestInterceptor8();

        InterceptorRegistration reg1 = registry.addInterceptor(inter1);
        InterceptorRegistration reg2 = registry.addInterceptor(inter2);
        InterceptorRegistration reg3 = registry.addInterceptor(inter3);
        InterceptorRegistration reg4 = registry.addInterceptor(inter4);
        InterceptorRegistration reg5 = registry.addInterceptor(inter5);
        InterceptorRegistration reg6 = registry.addInterceptor(inter6);
        InterceptorRegistration reg7 = registry.addInterceptor(inter7);
        InterceptorRegistration reg8 = registry.addInterceptor(inter8);

        reg1.addPathPatterns("/test1");
        reg2.addPathPatterns("/test1");
        reg3.addPathPatterns("/test2");

        reg4.addPathPatterns("/test1", "/test2");

        reg5.addPathPatterns("/sub1/test3", "/sub1/test4");

        // reg6.addPathPatterns("/"); 루트 url만
        reg6.addPathPatterns("/*"); // /?/? 패턴은 안댐

        reg7.addPathPatterns("/sub1/*");

        reg8.addPathPatterns("/**");

        reg8.excludePathPatterns("/*");
    }

}