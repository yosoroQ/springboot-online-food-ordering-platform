package com.li.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.ruiji.dto.DishDto;
import com.li.ruiji.entity.Dish;

public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表: dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

}
