package com.example.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableConfigurationProperties(CustomProperty.class)
@RestController
public class Application {

	@Autowired
	public Environment environment;

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplication app=new SpringApplication(Application.class);

		Map<String,Object> map =new HashMap<String, Object>();
		map.put("mynameis","helloworld");
		map.put("server.port",0);
		map.put("server.servlet.context-path","/app");
		app.setDefaultProperties(map);
		app.run(args);
	}

	@RequestMapping("/mynameis")
	public String myname(){
		return environment.getProperty("mynameis");
	}

}
