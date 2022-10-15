package com.li.ruiji.controller;

import com.li.ruiji.entity.OrderDetail;
import com.li.ruiji.service.OrderDetailService;
import com.li.ruiji.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//订单明细（用户下单）
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
}





