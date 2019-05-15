package com.ai.controller;

import com.ai.orderapi.IOrderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: wangql
 * @Date: 2019/4/25 15:59
 * @Description:
 */
@RestController
public class OrderImpl implements IOrderService {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/userToOrder")
    public String userToOrder() {
        return "端口为:" + port + " IOrderService 被调用";
    }
}