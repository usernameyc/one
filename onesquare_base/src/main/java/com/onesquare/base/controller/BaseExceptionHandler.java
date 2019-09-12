package com.onesquare.base.controller;

import com.entity.Result;
import com.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error1(Exception e){
        return new Result(false, StatusCode.ERROR,"基础微服务异常："+e.getMessage());
    }

}
