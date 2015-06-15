/*

 */
package com.scase.core.dao;

import java.util.List;

import com.scase.core.entity.Area;

/**
 * Dao - 地区
 * 
 * @author SHOP++ Team
 * @version 3.0
 */
public interface AreaDao extends BaseDao<Area, Long> {

	/**
	 * 查找顶级地区
	 * 
	 * @param count
	 *            数量
	 * @return 顶级地区
	 */
	List<Area> findRoots(Integer count);

}