package com.hao.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hao.dao.ICommonDao;
import com.hao.pojo.Base;

@Repository
public class CommonDao extends BaseDao implements ICommonDao<Base> {

	@Override
	public int insert(String namespace, Base entity) {
		return getSqlSession().insert(namespace, entity);
	}

	@Override
	public void updateByField(String namespace, Object fieldName) {
		getSqlSession().update(namespace, fieldName);
	}

	@Override
	public void updateByMap(String namespace, Map<String, Object> map) {
		getSqlSession().update(namespace, map);
	}

	@Override
	public void updateByEntity(String namespace, Base entity) {
		getSqlSession().update(namespace, entity);
	}

	@Override
	public void deleteByField(String namespace, Object fieldName) {
		getSqlSession().delete(namespace, fieldName);
	}

	@Override
	public void deleteByMap(String namespace, Map<String, Object> map) {
		getSqlSession().delete(namespace, map);
	}

	@Override
	public void deleteByEntity(String namespace, Base entity) {
		getSqlSession().delete(namespace, entity);
	}

	@Override
	public Base findByField(String namespace, Object fieldName) {
		return getSqlSession().selectOne(namespace, fieldName);
	}

	@Override
	public Base findByMap(String namespace, Map<String, Object> map) {
		return getSqlSession().selectOne(namespace, map);
	}

	@Override
	public Base findByEntity(String namespace, Base entity) {
		return getSqlSession().selectOne(namespace, entity);
	}

	@Override
	public List<Base> findByFieldList(String namespace, Object fieldName) {
		return getSqlSession().selectList(namespace, fieldName);
	}

	@Override
	public List<Base> findByMapList(String namespace, Map<String, Object> map) {
		return getSqlSession().selectList(namespace, map);
	}

	@Override
	public List<Base> findByEntityList(String namespace, Base entity) {
		return getSqlSession().selectList(namespace, entity);
	}

}
