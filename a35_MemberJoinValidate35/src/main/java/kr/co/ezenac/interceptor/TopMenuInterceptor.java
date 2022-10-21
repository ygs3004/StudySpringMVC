package kr.co.ezenac.interceptor;

import kr.co.ezenac.beans.BoardInfoBean;
import kr.co.ezenac.service.TopMenuService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class TopMenuInterceptor implements HandlerInterceptor {

    private TopMenuService topMenuService;

    public TopMenuInterceptor(TopMenuService topMenuService){
        this.topMenuService = topMenuService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        List<BoardInfoBean> topMenuList = topMenuService.getTopMenuList();
        request.setAttribute("topMenuList", topMenuList);

        return true;
    }


}
