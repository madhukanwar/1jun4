package com.example.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.List;

@ConfigurationProperties
public class CustomProperty {

    public String productName="amozon";

    public List<String> lst= Arrays.asList("mobile","tablet","laptop");

}
