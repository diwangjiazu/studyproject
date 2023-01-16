/*
 * Project: studyproject
 *
 * File Created at 2022-06-22
 *
 * Copyright 2012-2015 Greenline.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Greenline Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Greenline.com.
 */
package com.lbf.base.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-06-22 10:48
 */
@Aspect
@Component
public class LogAspect {


    @Pointcut("@annotation(com.lbf.base.Log)")
    public void annotationPoinCut(){}

    @Before(value = "annotationPoinCut()")
    public void log(JoinPoint joinPoint){
        System.out.println("打日志");
    }


}
