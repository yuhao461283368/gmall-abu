package com.atguigu.gmall.sms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.sms.entity.SkuBoundsEntity;
import com.atguigu.gmall.sms.vo.SkuSaleVO;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * 商品sku积分设置
 *
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 22:45:33
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSkuSaleInfo(SkuSaleVO skuSaleDTO);
}

