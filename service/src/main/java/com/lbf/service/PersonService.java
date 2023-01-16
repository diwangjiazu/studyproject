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
package com.lbf.service;

import com.lbf.client.PersonClient;
import com.lbf.dal.mapper.PersonMapper;
import com.lbf.dal.po.Person;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-06-07 18:19
 */
@RestController
@RequestMapping("/person")
public class PersonService implements IPersonService{

    @Resource
    private PersonMapper personMapper;

    @RequestMapping(value = "/select")
    @Override
    @Transactional
    public List<Person> select(){
        return personMapper.select(new Person());
    }

}
