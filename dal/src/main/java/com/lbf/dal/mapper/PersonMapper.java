/*
 * Project: study
 *
 * File Created at 2022-05-19
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
package com.lbf.dal.mapper;

import com.lbf.dal.po.Person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-05-19 10:39
 */
public interface PersonMapper {

    List<Person> select(@Param("po") Person person);
}
