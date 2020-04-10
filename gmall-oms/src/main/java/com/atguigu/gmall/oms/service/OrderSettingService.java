package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderSettingEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单配置信息
 *
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 23:14:05
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageVo queryPage(QueryCondition params);
}

