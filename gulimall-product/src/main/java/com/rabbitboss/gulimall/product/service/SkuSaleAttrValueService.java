package com.rabbitboss.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbitboss.common.utils.PageUtils;
import com.rabbitboss.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-01 18:42:16
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

