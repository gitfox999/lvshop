/*
 * 
 * 
 * 
 */
package net.shopxx.dao.impl;

import net.shopxx.dao.OrderItemDao;
import net.shopxx.entity.OrderItem;

import org.springframework.stereotype.Repository;

/**
 * Dao - 订单项
 * 
 * 
 * 
 */
@Repository("orderItemDaoImpl")
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem, Long> implements OrderItemDao {

}