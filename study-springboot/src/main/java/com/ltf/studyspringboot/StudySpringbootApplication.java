package com.ltf.studyspringboot;

import com.ltf.studyspringboot.context.MyApplicationEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// @MapperScan 等同于配置了的MapperScannerConfigurer
//@MapperScan("com.ltf.studyspringboot.dao")
public class StudySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(StudySpringbootApplication.class);
        application.run(args);
        /*// 增加监听器
        application.addListeners(new ApplicationListener<MyApplicationEvent>() {
            @Override
            public void onApplicationEvent(MyApplicationEvent event) {
                System.out.println(event.getSource());
            }
        });
        ConfigurableApplicationContext run = application.run(args);
        run.publishEvent(new MyApplicationEvent("nihao"));*/

    }
}
