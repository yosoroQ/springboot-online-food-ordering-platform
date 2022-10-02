package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.dto.DishDto;
import com.li.ruiji.entity.Dish;
import com.li.ruiji.entity.DishFlavor;
import com.li.ruiji.mapper.DishMapper;
import com.li.ruiji.service.DishFlavorService;
import com.li.ruiji.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DishServicelmpl extends ServiceImpl<DishMapper, Dish> implements DishService {

    @Autowired
    private DishFlavorService dishFlavorService;

    //新增菜品，同时保存对应的口味数据
    @Transactional
    public void saveWithFlavor(DishDto dishDto){
        //保存菜品的基本信息到菜品表dish
        this.save(dishDto);

        Long dishId = dishDto.getId();//菜品ID

        //菜品口味
        List<DishFlavor> flavors =dishDto.getFlavors();
        flavors = flavors.stream().map((item) ->{
            item.setDishId(dishId);
            return item;
        }).collect(Collectors.toList());

        //保存菜品口味数据到菜品口味表dish_flavor
        dishFlavorService.saveBatch(flavors);
    }
}
