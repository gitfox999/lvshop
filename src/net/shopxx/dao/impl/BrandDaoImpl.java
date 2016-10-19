/*
 * 
 * 
 * 
 */
package net.shopxx.dao.impl;

import net.shopxx.dao.BrandDao;
import net.shopxx.entity.Brand;

import org.springframework.stereotype.Repository;

/**
 * Dao - 品牌
 * 
 * 
 * 
 */
@Repository("brandDaoImpl")
public class BrandDaoImpl extends BaseDaoImpl<Brand, Long> implements BrandDao {

}