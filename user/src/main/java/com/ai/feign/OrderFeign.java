package com.ai.feign;

import com.ai.orderapi.IOrderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Auther: wangql
 * @Date: 2019/4/25 16:11
 * @Description:
 */

@FeignClient("order")
public interface OrderFeign extends IOrderService {
}