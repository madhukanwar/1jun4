package com.example.SpringBootSwing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Application {

	@Autowired
	public Simple2 simple2;

	public static void main(String[] args) {

		//SpringApplication.run(Application.class, args);

		//SpringApplicationBuilder sab=new SpringApplicationBuilder(Application.class);
		//sab.headless(false).run(args);

		ConfigurableApplicationContext context =new SpringApplicationBuilder(
				Application.class).headless(false).run(args);

		new Simple2();
	}

}
