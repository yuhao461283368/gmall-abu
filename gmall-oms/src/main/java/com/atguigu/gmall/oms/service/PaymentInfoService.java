package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.PaymentInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 23:14:05
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

