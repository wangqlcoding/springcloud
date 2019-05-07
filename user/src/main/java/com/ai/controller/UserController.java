package com.ai.controller;

import com.ai.feign.OrderFeign;
import com.ai.service.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangql
 * @Date: 2019/4/22 19:48
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public String getUser() {
        return "hello user!";
    }

    @RequestMapping(path="/getUser/{id}")
    public String getOrderById(@PathVariable("id") Integer id) {
        System.out.println("hello user:getUser " + id);
        String s = userService.getUserOrder(id);
        return s;
    }

    @Autowired
    private OrderFeign orderFeign;

    @RequestMapping("/userToOrder")
    public String userToOrder(){
        System.out.println("user 调用 order");
        String s =  orderFeign.userToOrder();
        return s;
    }
}