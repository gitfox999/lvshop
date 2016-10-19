/*
 * 
 * 
 * 
 */
package net.shopxx.dao;

import net.shopxx.entity.Cart;

/**
 * Dao - 购物车
 * 
 * 
 * 
 */
public interface CartDao extends BaseDao<Cart, Long> {

	/**
	 * 清除过期购物车
	 */
	void evictExpired();

}