package com.lbf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lbf.dal.mapper")
@EnableFeignClients(basePackages = {"com.lbf.client"})
@EnableTransactionManagement
public class StudyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyprojectApplication.class, args);
	}

}
