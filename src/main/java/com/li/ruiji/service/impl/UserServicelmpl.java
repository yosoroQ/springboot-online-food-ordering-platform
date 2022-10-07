package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.entity.SetmealDish;
import com.li.ruiji.entity.User;
import com.li.ruiji.mapper.SetmealDishMapper;
import com.li.ruiji.mapper.UserMapper;
import com.li.ruiji.service.SetmealDishService;
import com.li.ruiji.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl extends ServiceImpl<UserMapper, User> implements UserService {
}


