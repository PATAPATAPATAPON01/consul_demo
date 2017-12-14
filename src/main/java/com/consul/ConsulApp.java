package com.consul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PataPon on 2017/12/14.
 */
@RestController
public class ConsulApp {


    @RequestMapping("/home")
    public Object home() {
        System.out.println("1111111111111");
        return "OK11";
    }

}
