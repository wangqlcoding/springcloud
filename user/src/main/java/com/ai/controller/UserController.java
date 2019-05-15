package com.ai.controller;

import com.ai.feign.OrderFeign;
import com.ai.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther: wangql
 * @Date: 2019/4/22 19:48
 * @Description:
 */
@Api("UserController")
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

    @ApiOperation("userToOrder")
    @GetMapping("/userToOrder")
    public String userToOrder(){
        System.out.println("user 调用 order");
        String s =  orderFeign.userToOrder();
        return s;
    }

    @ApiImplicitParam(name="name", value = "用户名称", required = true, dataType = "String")
    @PostMapping("/testSwagger2")
    public String testSwagger2(String name){
        return "name =" + name;
    }
}