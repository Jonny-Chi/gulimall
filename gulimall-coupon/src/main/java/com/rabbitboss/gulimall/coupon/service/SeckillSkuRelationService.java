package com.rabbitboss.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbitboss.common.utils.PageUtils;
import com.rabbitboss.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 12:35:19
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

