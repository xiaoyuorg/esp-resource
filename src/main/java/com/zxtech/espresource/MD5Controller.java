package com.zxtech.espresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
public class MD5Controller {
    @Autowired
    private ResourceProperties resourceProperties;

    @GetMapping("md5/{filePath}")
    public String getMD5Code(@PathVariable String filePath) throws IOException {
        String path = resourceProperties.getFilePath() + filePath;
        File trailFile = new File(path);
        if (trailFile.exists()) {
            String ret = DigestUtils.md5DigestAsHex(new FileInputStream(path));
            return ret;
        } else {
            return "0";
        }
    }
}
