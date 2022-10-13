package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.entity.SetmealDish;
import com.li.ruiji.entity.ShoppingCart;
import com.li.ruiji.mapper.SetmealDishMapper;
import com.li.ruiji.mapper.ShoppingCartMapper;
import com.li.ruiji.service.SetmealDishService;
import com.li.ruiji.service.ShoppingCartService;
import org.springframework.stereotype.Service;


@Service
public class ShoppingCartServicelmpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}

