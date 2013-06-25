package com.hao.service;

import java.util.List;

import com.hao.exception.ServiceException;
import com.hao.pojo.User;

public interface IUserService {

	/**
	 * 添加用户
	 * @param user
	 * @return
	 * @throws ServiceException
	 */
	int saveUser(User user) throws ServiceException;

	/**
	 * 根据id修改用户
	 * @param user
	 * @return
	 * @throws ServiceException 
	 */
	boolean updateUserById(User user) throws ServiceException;

	/**
	 * 根据id删除用户
	 * @param id
	 * @return
	 * @throws ServiceException 
	 */
	boolean deleteUserById(Integer id) throws ServiceException;

	/**
	 * 查询所有用户
	 * @return
	 */
	List<User> getUsers();
}
