package com.rabbitboss.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbitboss.common.utils.PageUtils;
import com.rabbitboss.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-01 18:42:17
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

