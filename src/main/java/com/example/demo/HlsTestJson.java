package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kw-hls on 2017/9/21.
 */
@RestController
public class HlsTestJson {
    @GetMapping("/hls")
    public List<Hls1> testJson(){
        List<Hls1> list=new ArrayList<>();
        Hls1 hls1=new Hls1();
        hls1.setName("小姐姐");
        hls1.setSex("女");
        Hls1 hls2=new Hls1();
        hls2.setName("小哥哥");
        hls2.setSex("男");
        list.add(hls1);
        list.add(hls2);
        return list;
    }

}
