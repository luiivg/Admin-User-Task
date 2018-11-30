/**
 * 
 */
package com.processonline.usertask.backend.apirest.models.services;

import java.util.List;

import com.processonline.usertask.backend.apirest.models.entity.User;

/**
 * @author luisa
 *
 */
public interface IUserService {
	
	public List<User> findAll();

}
