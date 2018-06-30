package com.ltf.studyspringboot.config;

import com.ltf.studyspringboot.intecept.ForbidenTestUserIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
  * web mvc拦截器需要注册到web config中
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:WebConfiguration 2018年06月06日 18:29:50 luotianfu$
  * @since 1.0
  */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    @Autowired
    private ForbidenTestUserIntercept testUserIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testUserIntercept);
    }


}
