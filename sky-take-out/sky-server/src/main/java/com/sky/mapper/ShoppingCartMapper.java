package com.sky.mapper;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    /**
     * 通过id查找
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> getById(ShoppingCart shoppingCart);

    /**
     * 更新购物车数据
     * @param shoppingCart
     */
    @Update("update sky_take_out.shopping_cart set number=#{number} where id=#{id}")
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入新数据
     * @param shoppingCart
     */
    @Insert("insert into sky_take_out.shopping_cart (create_time, number, amount, dish_flavor, setmeal_id, dish_id, user_id, image, name) " +
            "values (#{createTime},#{number},#{amount},#{dishFlavor},#{setmealId},#{dishId},#{userId},#{image},#{name})")
    void insert(ShoppingCart shoppingCart);

    /**
     * 通过userId查看购物车
     * @param userId
     * @return
     */
    @Select("select * from sky_take_out.shopping_cart where user_id=#{userId}")
    List<ShoppingCart> getByUserId(Long userId);

    /**
     * 通过userId删除购物车信息
     * @param userId
     */
    @Delete("delete from sky_take_out.shopping_cart where user_id=#{userId}")
    void deleteByUserId(Long userId);

    /**
     * 通过id删除记录
     * @param id
     */
    @Delete("delete from sky_take_out.shopping_cart where id=#{id}")
    void deleteById(Long id);

    /**
     * 批量插入购物车数据
     *
     * @param shoppingCartList
     */
    void insertBatch(List<ShoppingCart> shoppingCartList);
}
