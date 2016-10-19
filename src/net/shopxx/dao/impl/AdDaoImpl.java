/*
 * 
 * 
 * 
 */
package net.shopxx.dao.impl;

import net.shopxx.dao.AdDao;
import net.shopxx.entity.Ad;

import org.springframework.stereotype.Repository;

/**
 * Dao - 广告
 * 
 * 
 * 
 */
@Repository("adDaoImpl")
public class AdDaoImpl extends BaseDaoImpl<Ad, Long> implements AdDao {

}