package com.ltf.studyspringboot.context;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
    @Override
    public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
        Object source = myApplicationEvent.getSource();
        // 模拟异常邮件发送
        System.out.println("正在发送邮件给小明"+source);
    }
}
