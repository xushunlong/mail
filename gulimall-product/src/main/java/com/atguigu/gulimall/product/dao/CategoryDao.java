package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xushunlong
 * @email 1061407277@qq.com
 * @date 2022-12-28 18:01:31
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
