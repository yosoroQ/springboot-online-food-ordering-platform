package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.entity.Dish;
import com.li.ruiji.entity.Setmeal;
import com.li.ruiji.mapper.DishMapper;
import com.li.ruiji.mapper.SetmealMapper;
import com.li.ruiji.service.DishService;
import com.li.ruiji.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealServicelmpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}


