package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author canjian
 * @email 634192923@qq.com
 * @date 2019-12-03 18:38:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
