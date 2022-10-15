package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.entity.OrderDetail;
import com.li.ruiji.entity.Orders;
import com.li.ruiji.mapper.OrderDetailMapper;
import com.li.ruiji.mapper.OrderMapper;
import com.li.ruiji.service.OrderDetailService;
import com.li.ruiji.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServicelmpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService{
}


