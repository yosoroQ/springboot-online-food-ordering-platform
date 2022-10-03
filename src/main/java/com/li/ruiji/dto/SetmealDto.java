package com.li.ruiji.dto;

import com.li.ruiji.entity.Setmeal;
import com.li.ruiji.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
