package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author canjian
 * @email 634192923@qq.com
 * @date 2019-12-03 18:49:10
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
