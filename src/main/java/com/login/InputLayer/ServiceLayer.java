package com.login.InputLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.Input.Input;
import com.login.InputDao.Dao;

@Service
public class ServiceLayer {
	
	@Autowired
	
	private Dao dao;
	
	public int createInput(Input input) {
		return this.dao.SaveUser(input);
	}

	
}
