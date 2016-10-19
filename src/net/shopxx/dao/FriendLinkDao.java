/*
 * 
 * 
 * 
 */
package net.shopxx.dao;

import java.util.List;

import net.shopxx.entity.FriendLink;
import net.shopxx.entity.FriendLink.Type;

/**
 * Dao - 友情链接
 * 
 * 
 * 
 */
public interface FriendLinkDao extends BaseDao<FriendLink, Long> {

	/**
	 * 查找友情链接
	 * 
	 * @param type
	 *            类型
	 * @return 友情链接
	 */
	List<FriendLink> findList(Type type);

}