package com.example.micro_letter_ordering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@MapperScan("com.example.micro_letter_ordering.dao")
@EnableTransactionManagement//项目支持事物
@EnableSwagger2
@SpringBootApplication
public class MicroLetterOrderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroLetterOrderingApplication.class, args);
	}

}
