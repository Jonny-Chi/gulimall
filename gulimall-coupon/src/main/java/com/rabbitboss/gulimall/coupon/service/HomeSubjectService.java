package com.rabbitboss.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rabbitboss.common.utils.PageUtils;
import com.rabbitboss.gulimall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 12:35:19
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

