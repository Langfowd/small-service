package com.ltf.studyspringboot.controller;

import com.ltf.studyspringboot.exception.ValidateException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

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

    @ExceptionHandler(ValidateException.class)
    public Map validateExceptionHander(ValidateException ex){
        HashMap map = new HashMap<>();
        map.put("msg",ex.getMessage());
        map.put("code",ex.getCode());
        return map;
    }
}
