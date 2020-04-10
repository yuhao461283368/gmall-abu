package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 22:45:33
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
