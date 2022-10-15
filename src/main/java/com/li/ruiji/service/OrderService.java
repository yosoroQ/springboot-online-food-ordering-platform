package com.li.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.ruiji.entity.Orders;
import com.li.ruiji.entity.ShoppingCart;

public interface OrderService extends IService<Orders>{

    //用户下单
    public void submit(Orders orders) ;

}

