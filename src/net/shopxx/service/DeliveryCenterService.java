/*
 * 
 * 
 * 
 */
package net.shopxx.service;

import net.shopxx.entity.DeliveryCenter;

/**
 * Service - 发货点
 * 
 * 
 * 
 */
public interface DeliveryCenterService extends BaseService<DeliveryCenter, Long> {

	/**
	 * 查找默认发货点
	 * 
	 * @return 默认发货点，若不存在则返回null
	 */
	DeliveryCenter findDefault();

}