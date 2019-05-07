package com.ai.orderapi;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: wangql
 * @Date: 2019/4/25 15:54
 * @Description:
 */
public interface IOrderService {

    @RequestMapping("/userToOrder")
    public String userToOrder();
}
