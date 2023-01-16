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
package com.lbf.controller;

import com.lbf.base.Log;
import com.lbf.client.PersonClient;
import com.lbf.dal.po.Person;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-06-07 18:24
 */
@RequestMapping("/person")
@RestController
public class PersonController {

    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private PersonClient personClient;

    @RequestMapping(method = RequestMethod.GET,value = "/get")
    @Log
    public List<Person> get(){
      return personClient.select();
    }

}
