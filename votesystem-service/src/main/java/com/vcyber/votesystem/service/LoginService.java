package com.vcyber.votesystem.service;

import java.util.List;

import com.vcyber.votesystem.entity.USER;

public interface LoginService {
	
	
	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	public boolean createUser(USER user);
	
	public USER findUser(USER user);
	
	public List<USER> findALLUser();
	
	public USER findUserById(Integer id);
	
	public void updateUser(USER user);
}
