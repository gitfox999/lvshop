/*
 * 
 * 
 * 
 */
package net.shopxx.service;

import net.shopxx.entity.Log;

/**
 * Service - 日志
 * 
 * 
 * 
 */
public interface LogService extends BaseService<Log, Long> {

	/**
	 * 清空日志
	 */
	void clear();

}