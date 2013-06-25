package com.hao.dao;

import java.util.List;
import java.util.Map;

import com.hao.pojo.Base;

public interface ICommonDao<T extends Base> {

	/**
	 * 插入数据
	 * @param namespace	命名空间+ID
	 * @param entity	实体对象
	 * @return 
	 */
	int insert(String namespace, T entity);

	/**
	 * 根据fieldName修改
	 * @param namespace	命名空间+ID
	 * @param fieldName	字段名
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void updateByField(String namespace, Object fieldName);

	/**
	 * 根据map修改
	 * @param namespace	命名空间+ID
	 * @param map		map对象
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void updateByMap(String namespace, Map<String, Object> map);

	/**
	 * 根据实体对象修改
	 * @param namespace	命名空间+ID
	 * @param entity	实体对象
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void updateByEntity(String namespace, T entity);

	/**
	 * 根据fieldName删除
	 * @param namespace	命名空间+ID
	 * @param fieldName	字段名
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void deleteByField(String namespace, Object fieldName);

	/**
	 * 根据map删除
	 * @param namespace	命名空间+ID
	 * @param map		map对象
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void deleteByMap(String namespace, Map<String, Object> map);

	/**
	 * 根据实体对象删除
	 * @param namespace	命名空间+ID
	 * @param entity	实体对象
	 * @return	成功true, 否则false.
	 * @ 
	 */
	void deleteByEntity(String namespace, T entity);

	/**
	 * 根据fieldName查询
	 * @param namespace	命名空间+ID
	 * @param fieldName	字段名
	 * @return	T实体对象
	 */
	T findByField(String namespace, Object fieldName);

	/**
	 * 根据map查询
	 * @param namespace	命名空间+ID
	 * @param map		map对象
	 * @return	T实体对象
	 */
	T findByMap(String namespace, Map<String, Object> map);

	/**
	 * 根据实体对象查询
	 * @param namespace	命名空间+ID
	 * @param entity	实体对象
	 * @return	T实体对象
	 */
	T findByEntity(String namespace, T entity);

	/**
	 * 根据fieldName查询
	 * @param namespace	命名空间+ID
	 * @param fieldName	字段名
	 * @return	T实体对象的集合
	 */
	List<T> findByFieldList(String namespace, Object fieldName);

	/**
	 * 根据map查询
	 * @param namespace	命名空间+ID
	 * @param map		map对象
	 * @return	T实体对象的集合
	 */
	List<T> findByMapList(String namespace, Map<String, Object> map);

	/**
	 * 根据实体对象查询
	 * @param namespace	命名空间+ID
	 * @param entity	实体对象
	 * @return	T实体对象的集合
	 */
	List<T> findByEntityList(String namespace, T entity);

}
