package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.common.CustomException;
import com.li.ruiji.dto.SetmealDto;
import com.li.ruiji.entity.Dish;
import com.li.ruiji.entity.Setmeal;
import com.li.ruiji.entity.SetmealDish;
import com.li.ruiji.mapper.DishMapper;
import com.li.ruiji.mapper.SetmealMapper;
import com.li.ruiji.service.DishService;
import com.li.ruiji.service.SetmealDishService;
import com.li.ruiji.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SetmealServicelmpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {

    @Autowired
    private SetmealDishService setmealDishService;

    //新增套餐，同时需要保存套餐和菜品的关联关系
    @Transactional
    public void saveWithDish(SetmealDto setmealDto){
        //保存套餐的基本信息，操作setmeal，执行insert操作
        this.save(setmealDto);
        List<SetmealDish> setmealDishes = setmealDto.getSetmealDishes();
        setmealDishes.stream().map((item) ->{
            item.setSetmealId(setmealDto.getId());
            return item;
        }).collect(Collectors.toList());

        //保存套餐和菜品的关联信息，操作setmeal_dish,执行insert操作
        setmealDishService.saveBatch(setmealDishes);

    }

    //删除套餐,同时需要删除套餐和菜品的关联数据
    @Transactional
    public void removeWithDish(List<Long> ids){
        //查询套餐状态，确定是否可用删除
        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(Setmeal::getId,ids);
        queryWrapper.eq(Setmeal::getStatus,1);

        int count = this.count(queryWrapper);
        if (count > 0 ){
            //如果不能删除，抛出一个业务异常
            throw new CustomException("套餐正在售卖中，不能删除");
        }

        //如果可以删除，先删除套餐表中的数据 _ setmeal
        this.removeByIds(ids);

        LambdaQueryWrapper<SetmealDish> LambdaQueryWrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper.in(SetmealDish::getSetmealId,ids);

        //删除关系表中的数据 _ setmeal_dish
        setmealDishService.remove(LambdaQueryWrapper);

    }

}


