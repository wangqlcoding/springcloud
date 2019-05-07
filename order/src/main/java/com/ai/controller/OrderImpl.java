package com.ai.controller;

import com.ai.orderapi.IOrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangql
 * @Date: 2019/4/25 15:59
 * @Description:
 */
@RestController
public class OrderImpl implements IOrderService {

    @RequestMapping("/userToOrder")
    public String userToOrder() {
        return "IOrderService 被调用";
    }
}