package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kw-hls on 2017/9/21.
 */
@RestController
public class HlsTestJson {
    @GetMapping("/hls")
    public Hls1 testJson(){
        Hls1 hls1=new Hls1();
        hls1.setName("小姐姐");
        hls1.setSex("女");
        return hls1;
    }
}
