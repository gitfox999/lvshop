/*
 * 
 * 
 * 
 */
package net.shopxx.service.impl;

import javax.annotation.Resource;

import net.shopxx.dao.ParameterDao;
import net.shopxx.entity.Parameter;
import net.shopxx.service.ParameterService;

import org.springframework.stereotype.Service;

/**
 * Service - 参数
 * 
 * 
 * 
 */
@Service("parameterServiceImpl")
public class ParameterServiceImpl extends BaseServiceImpl<Parameter, Long> implements ParameterService {

	@Resource(name = "parameterDaoImpl")
	public void setBaseDao(ParameterDao parameterDao) {
		super.setBaseDao(parameterDao);
	}

}