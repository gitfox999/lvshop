/*
 * 
 * 
 * 
 */
package net.shopxx.dao.impl;

import javax.persistence.FlushModeType;
import javax.persistence.NoResultException;

import net.shopxx.dao.PaymentDao;
import net.shopxx.entity.Payment;

import org.springframework.stereotype.Repository;

/**
 * Dao - 收款单
 * 
 * 
 * 
 */
@Repository("paymentDaoImpl")
public class PaymentDaoImpl extends BaseDaoImpl<Payment, Long> implements PaymentDao {

	public Payment findBySn(String sn) {
		if (sn == null) {
			return null;
		}
		String jpql = "select payment from Payment payment where lower(payment.sn) = lower(:sn)";
		try {
			return entityManager.createQuery(jpql, Payment.class).setFlushMode(FlushModeType.COMMIT).setParameter("sn", sn).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}