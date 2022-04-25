package com.rabbitboss.gulimall.order.dao;

import com.rabbitboss.gulimall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 13:56:19
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
