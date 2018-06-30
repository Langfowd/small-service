package com.ltf.studyspringboot.intecept;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.ConcurrentHashMap;

/**
  * web mvc 拦截器
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:ForbidenTestUserIntercept 2018年06月06日 18:29:33 luotianfu$
  * @since 1.0
  */
@Component
public class ForbidenTestUserIntercept implements HandlerInterceptor {
    private ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap(16);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        synchronized (map){
            String requestURI = request.getRequestURI();
            if (map.containsKey(requestURI)){
                int requestCount = map.get(requestURI)+1;
                if (requestCount>10){
                    response.getWriter().write("请求次数已经达到最大！");
                    return false;
                }
                map.put(requestURI,requestCount);
            }else {
                map.put(requestURI,1);
            }
        }
        return  true;
    }

}
