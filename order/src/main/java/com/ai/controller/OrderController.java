package com.ai.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangql
 * @Date: 2019/4/22 19:58
 * @Description:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/getOrder")
    public String getOrder(){
        return "hello order ";
    }

    @RequestMapping(path="/getOrderById/{id}")
    public String getOrderById(@PathVariable("id") Integer id) {
        return "hello order:getOrderById " + id;
    }
}