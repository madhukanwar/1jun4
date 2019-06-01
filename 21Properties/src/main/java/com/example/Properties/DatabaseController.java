package com.example.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@PropertySource("database.properties")
@RestController
public class DatabaseController {

    @Autowired
    public Environment environment;

    @RequestMapping("/database")
    public String database(){
        return environment.getProperty("database.url");
    }
}
