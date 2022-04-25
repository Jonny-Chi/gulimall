package com.rabbitboss.gulimall.product.dao;

import com.rabbitboss.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-01 18:42:17
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
