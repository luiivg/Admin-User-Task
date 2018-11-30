/**
 * 
 */
package com.processonline.usertask.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.processonline.usertask.backend.apirest.models.entity.User;

/**
 * @author luisa
 *
 */
public interface IUserDao extends CrudRepository<User, Integer>{

}
