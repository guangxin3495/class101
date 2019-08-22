package com.itheima.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@ConfigurationProperties(prefix = "user")
@Component
@Data
public class User {
    private String username;
    private int age;

    private List<String> girls;


}
