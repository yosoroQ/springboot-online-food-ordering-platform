package com.li.ruiji.controller;

import com.li.ruiji.common.R;
import com.li.ruiji.dto.DishDto;
import com.li.ruiji.entity.DishFlavor;
import com.li.ruiji.service.DishFlavorService;
import com.li.ruiji.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public R<String> save(DishDto dishDto){
//        https://www.bilibili.com/video/av213091208/?p=57
        return null;
    }
}
