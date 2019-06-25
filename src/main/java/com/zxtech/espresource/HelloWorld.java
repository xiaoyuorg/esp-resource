package com.zxtech.espresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class HelloWorld {
    @RequestMapping("/")
    String hello(){
        return "hello!";
    }
}
