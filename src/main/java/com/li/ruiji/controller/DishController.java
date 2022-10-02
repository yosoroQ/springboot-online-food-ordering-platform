package com.li.ruiji.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.li.ruiji.common.R;
import com.li.ruiji.dto.DishDto;
import com.li.ruiji.entity.Category;
import com.li.ruiji.entity.Dish;
import com.li.ruiji.entity.DishFlavor;
import com.li.ruiji.service.DishFlavorService;
import com.li.ruiji.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

//菜品管理
@RestController
@RequestMapping("/dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @Autowired
    private DishFlavorService dishFlavorService;

    //新增菜品
    @PostMapping
    public R<String> save(@RequestBody DishDto dishDto){
        dishService.saveWithFlavor(dishDto);
        return R.success("新增菜品成功！");
    }

    //菜品信息分页查询
    @GetMapping("/page")
    public R<Page> page(int page,int pageSize,String name){

        //分页构造器
        Page<Dish> pageInfo = new Page<>(page,pageSize);

        //条件构造器
        LambdaQueryWrapper<Dish> queryWrapper = new LambdaQueryWrapper<>();

        //添加过滤条件
        queryWrapper.like(name !=null,Dish::getName,name);

        //添加排序条件
        queryWrapper.orderByAsc(Dish::getUpdateTime);

        //执行分页查询
        dishService.page(pageInfo,queryWrapper);

//        https://www.bilibili.com/video/av213091208/?p=62

        return R.success(pageInfo);
    }
}
