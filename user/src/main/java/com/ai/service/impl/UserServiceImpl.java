package com.ai.service.impl;

import com.ai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: wangql
 * @Date: 2019/4/22 20:06
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {


    private static String url = "http://ORDER";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getUserOrder(Integer id) {

       String s =  restTemplate.getForObject(url + "/order/getOrderById/" + id, String.class);
        return s;
    }
}