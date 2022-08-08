package com.github.btafare.md5sum;

import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@RestController
public class Md5sumController {

    @RequestMapping
    public String md5sum(@RequestParam("text") String text) throws Exception {
        return DigestUtils.md5DigestAsHex(text.getBytes());
    }
}
