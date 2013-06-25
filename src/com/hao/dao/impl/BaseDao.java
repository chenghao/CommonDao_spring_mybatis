package com.hao.dao.impl;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDao extends SqlSessionDaoSupport {

	@Resource(name = "sqlSessionFactory")
	private SqlSessionFactory sqlSessionFactory;

	@PostConstruct
	protected void initDao() throws Exception {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

}
