package com.example.demo.Service;

import com.example.demo.Config.YmlPropertiesConfig;
import org.springframework.stereotype.Component;

@Component
public class PrintProperties {
    public PrintProperties(YmlPropertiesConfig ymlPropertiesConfig) {
        System.out.println("Login Url:" + ymlPropertiesConfig.getLoginUrl());
//        System.out.println("User:" + ymlPropertiesConfig.getUser());
//        System.out.println("Password:" + ymlPropertiesConfig.getPassword());
        System.out.println("User:" + ymlPropertiesConfig.getCredentials().getUser());
        System.out.println("Password: " + ymlPropertiesConfig.getCredentials().getPassword());
    }
}
