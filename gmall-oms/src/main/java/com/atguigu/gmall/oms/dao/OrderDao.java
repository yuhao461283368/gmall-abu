package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 23:14:05
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
