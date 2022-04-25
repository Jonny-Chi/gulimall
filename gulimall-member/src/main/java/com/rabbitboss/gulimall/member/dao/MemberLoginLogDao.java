package com.rabbitboss.gulimall.member.dao;

import com.rabbitboss.gulimall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author Jonny
 * @email qiqiisnice@163.com
 * @date 2022-04-02 13:43:41
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
