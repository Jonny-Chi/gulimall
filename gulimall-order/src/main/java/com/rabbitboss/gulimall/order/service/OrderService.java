package com.rabbitboss.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbitboss.common.utils.PageUtils;
import com.rabbitboss.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 13:56:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

