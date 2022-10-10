package com.li.ruiji.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.li.ruiji.controller.AddressBook;
import com.li.ruiji.entity.DishFlavor;
import com.li.ruiji.mapper.AddressBookMapper;
import com.li.ruiji.mapper.DishFlavorMapper;
import com.li.ruiji.service.AddressBookService;
import com.li.ruiji.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServicelmpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
