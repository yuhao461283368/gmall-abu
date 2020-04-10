package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author abu
 * @email lxf@atguigu.com
 * @date 2020-04-10 23:02:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
