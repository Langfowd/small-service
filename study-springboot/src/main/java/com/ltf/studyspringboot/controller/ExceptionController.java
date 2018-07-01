package com.ltf.studyspringboot.controller;

import com.ltf.studyspringboot.context.MyApplicationEvent;
import com.ltf.studyspringboot.exception.ValidateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
  * 全局异常处理
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:ExceptionController 2018年06月07日 19:25:02 luotianfu$
  * @since 1.0
  */
@RestControllerAdvice
public class ExceptionController {

    @Autowired
    private ApplicationContext context;

    /*   @ExceptionHandler(ValidateException.class)
    public Map validateExceptionHander(ValidateException ex){
        HashMap map = new HashMap<>();
        map.put("msg",ex.getMessage());
        map.put("code",ex.getCode());
        return map;
    }*/
    @ExceptionHandler(Exception.class)
    public String validateExceptionHander(Exception ex){
        // 提示监听者有异常
        context.publishEvent(new MyApplicationEvent(getErrorInfoFromException(ex)));
        return "服务器繁忙!";
    }

    /**
     * 将异常信息转换为字符串形式
     * @param e
     * @return
     */
    public String getErrorInfoFromException(Exception e) {
        try {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            sw.close();
            pw.close();
            return "\r\n" + sw.toString() + "\r\n";
        } catch (Exception e2) {
            return "ErrorInfoFromException";
        }
    }
}
