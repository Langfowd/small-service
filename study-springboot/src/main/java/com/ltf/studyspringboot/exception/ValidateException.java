package com.ltf.studyspringboot.exception;

/**
  * 全局异常
  * @author <a href="mailto:luo_tian_fu@163.com">luotianfu</a>
  * @version $Id:ValidateException 2018年06月07日 19:22:41 luotianfu$
  * @since 1.0
  */
public class ValidateException extends RuntimeException{
    private String message;
    private String code;


    public ValidateException(String message, String code) {
        this.message = message;
        this.code = code;
    }

    /**
     * Gets the value of message.
     *
     * @return the value of message
     */
    @Override
    public String getMessage() {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the value of code.
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }
}
