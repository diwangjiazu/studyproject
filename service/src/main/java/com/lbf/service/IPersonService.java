/*
 * Project: studyproject
 *
 * File Created at 2022-06-25
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

import com.lbf.dal.po.Person;

import java.util.List;

/**
 * @author liangbf
 * @version V1.0
 * @since 2022-06-25 22:04
 */
public interface IPersonService {

    List<Person> select();

}
