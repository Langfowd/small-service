package com.ltf.studyspringboot.domin;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
  * 用户表
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:User 2018年06月10日 10:13:00 luotianfu$
  * @since 1.0
  */
@Data
public class User {

    @NotNull
    private String username;
    @NotNull
    private String password;
}
