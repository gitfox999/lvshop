/*
 * 
 * 
 * 
 */
package net.shopxx.service.impl;

import javax.annotation.Resource;

import net.shopxx.dao.AdDao;
import net.shopxx.entity.Ad;
import net.shopxx.service.AdService;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service - 广告
 * 
 * 
 * 
 */
@Service("adServiceImpl")
public class AdServiceImpl extends BaseServiceImpl<Ad, Long> implements AdService {

	@Resource(name = "adDaoImpl")
	public void setBaseDao(AdDao adDao) {
		super.setBaseDao(adDao);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public void save(Ad ad) {
		super.save(ad);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public Ad update(Ad ad) {
		return super.update(ad);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public Ad update(Ad ad, String... ignoreProperties) {
		return super.update(ad, ignoreProperties);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public void delete(Long id) {
		super.delete(id);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public void delete(Long... ids) {
		super.delete(ids);
	}

	@Override
	@Transactional
	@CacheEvict(value = "adPosition", allEntries = true)
	public void delete(Ad ad) {
		super.delete(ad);
	}

}