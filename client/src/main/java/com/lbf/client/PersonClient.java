/*
 * Project: studyproject
 *
 * File Created at 2022-06-07
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
package com.lbf.client;

import com.lbf.dal.po.Person;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-06-07 18:15
 */
@FeignClient(name = "studyproject",path = "/person")
public interface PersonClient {

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    List<Person> select();

}
