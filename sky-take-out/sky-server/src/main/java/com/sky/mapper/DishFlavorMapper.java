package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 菜品风味
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入菜品风味
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 删除菜品风味
     * @param dishId
     */
    @Delete("delete from sky_take_out.dish_flavor where dish_id=#{dishId}")
    void deleteById(Long dishId);
    /**
     * 批量删除菜品风味
     * @param dishIds
     */
    void deleteByIds(List<Long> dishIds);

    /**
     * 通过dishId获取菜品风味
     * @param dishId
     * @return
     */
    @Select("select * from sky_take_out.dish_flavor where dish_id=#{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
