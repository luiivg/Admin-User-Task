/**
 * 
 */
package com.processonline.usertask.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.processonline.usertask.backend.apirest.models.dao.IUserDao;
import com.processonline.usertask.backend.apirest.models.entity.User;

/**
 * @author luisa
 *
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return (List<User>)userDao.findAll();
	}

}
