package com.neo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author 27351
 */
@MapperScan("com.neo.mapper.*")
@SpringBootApplication
public class HelloApplication {

	@Bean
	public Runnable createRunnable(){
		return () -> System.out.println("Thread is running");
	}


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HelloApplication.class, args);
		System.out.println("============================");
		context.getBean(Runnable.class).run();
		//Class
		System.out.println("============================");
	}

}