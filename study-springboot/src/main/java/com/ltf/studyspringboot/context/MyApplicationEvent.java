package com.ltf.studyspringboot.context;

import org.springframework.context.ApplicationEvent;

/**
  * 事件监听
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:MyApplicationEvent 2018年07月01日 13:00:41 luotianfu$
  * @since 1.0
  */
public class MyApplicationEvent extends ApplicationEvent {
    public MyApplicationEvent(Object source) {
        super(source);
    }
}
