package com.hao.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.hao.BaseTest;
import com.hao.exception.ServiceException;
import com.hao.pojo.User;

public class UserServiceTest extends BaseTest {
	@Autowired
	private IUserService userService;

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setName("ddd");
		user.setAge(31);
		user.setSex("女");

		try {
			int id = userService.saveUser(user);

			System.out.println(id);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testUpdateUserById() {
		User user = new User();
		user.setId(16);
		user.setAge(20);

		try {
			boolean bool = userService.updateUserById(user);
			if (bool)
				System.err.println("修改成功。");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDeleteUserById() {
		try {
			boolean bool = userService.deleteUserById(17);
			if (bool)
				System.err.println("删除成功。");
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGetUsers() {
		List<User> lists = userService.getUsers();
		for (User user : lists) {
			System.err.println(user.getId() + "--" + user.getName() + "--" + user.getAge() + "--" + user.getSex() + "--" + user.getCreateDate());
		}
	}

}
