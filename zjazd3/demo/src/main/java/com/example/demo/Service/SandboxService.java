package com.example.demo.Service;

import com.example.demo.Config.YmlPropertiesConfig;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SandboxService {
    public String throwException(boolean shouldThrowException) {
        if (shouldThrowException) {
            throw new RuntimeException();
        }
        return "Exception was not thrown";
    }
}
