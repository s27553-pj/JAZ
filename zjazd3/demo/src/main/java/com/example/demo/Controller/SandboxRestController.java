package com.example.demo.Controller;

import com.example.demo.Config.YmlPropertiesConfig;
import com.example.demo.Service.SandboxService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandboxRestController {
//    private final SandboxService sandboxService;
//    private final YmlPropertiesConfig ymlPropertiesConfig;
    @GetMapping("/demo/e")
    public ResponseEntity<String> exception(){
        throw new RuntimeException("Testing RestControllerAdvice");
    }
    }

