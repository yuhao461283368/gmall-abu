package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.RefundInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 退款信息
 *
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 23:14:05
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

