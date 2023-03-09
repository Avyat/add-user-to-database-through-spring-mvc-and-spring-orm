package com.login.InputDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.login.Input.Input;

@Repository
public class Dao {
	@Autowired

	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int SaveUser(Input input) {
		int id=(Integer) this.hibernateTemplate.save(input);
		return id;
	}
	
}
