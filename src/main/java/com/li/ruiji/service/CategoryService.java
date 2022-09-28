package com.li.ruiji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.li.ruiji.entity.Category;
import com.li.ruiji.entity.Employee;

public interface CategoryService extends IService<Category> {
    //根据id删除分类，删除之前需要进行判断
    void remove(Long id);
//    public void remove(Long id);
}

