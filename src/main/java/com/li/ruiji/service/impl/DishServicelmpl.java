package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.entity.Dish;
import com.li.ruiji.mapper.DishMapper;
import com.li.ruiji.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServicelmpl extends ServiceImpl<DishMapper, Dish> implements DishService {
}
