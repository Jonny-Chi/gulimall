package com.rabbitboss.gulimall.order.dao;

import com.rabbitboss.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 13:56:19
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
