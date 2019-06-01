package com.example.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {

    @Autowired
    public Environment environment;

    @Value("${name}")
    public String name;

    @Value("${mylst}")
    public List<String> mylst;

    @Autowired
    public CustomProperty customProperty;

    @RequestMapping("/")
    public String index(){
        return environment.getProperty("name")+"\t"+
                name+"\t"+customProperty.productName;
    }

    @RequestMapping("/mylst")
    public List<String> getLst(){
        return mylst;
    }

    @RequestMapping("/products")
    public List<String> getAll(){
        return customProperty.lst;
    }


}
