package com.li.ruiji.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.li.ruiji.entity.Orders;
import com.li.ruiji.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders>{
}

