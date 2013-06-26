package com.hao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hao.dao.ICommonDao;
import com.hao.exception.ServiceException;
import com.hao.pojo.User;
import com.hao.service.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	private ICommonDao<User> commonDao;

	@Override
	public int saveUser(User user) throws ServiceException {
		try {
			commonDao.insert("user.saveUser", user);
			
			return user.getId();
		} catch (Exception e) {
			throw new ServiceException("保存用户失败。", e);
		}
	}

	@Override
	public boolean updateUserById(User user) throws ServiceException {
		try {
			commonDao.updateByEntity("user.updateUserById", user);

			return true;
		} catch (Exception e) {
			throw new ServiceException("根据id修改用户失败。", e);
		}
	}

	@Override
	public boolean deleteUserById(Integer id) throws ServiceException {
		try {
			commonDao.deleteByField("user.deleteUserById", id);

			return true;
		} catch (Exception e) {
			throw new ServiceException("根据id删除用户失败。", e);
		}
	}

	@Override
	public List<User> getUsers() {
		return commonDao.findByFieldList("user.findUsers", "");
	}

	@Override
	public int getUserCount() {
		int count = (int) commonDao.findByFieldObject("user.getUserCount", "");
		return count;
	}

}
