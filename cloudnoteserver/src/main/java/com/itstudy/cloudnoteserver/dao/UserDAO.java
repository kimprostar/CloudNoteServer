package com.itstudy.cloudnoteserver.dao;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itstudy.cloudnoteserver.domain.User;

@Repository
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	

	//회원가입
	public Serializable insert(User user) {
		
		return sessionFactory.getCurrentSession().save(user);
	}
	
	//탈퇴
	public void delete(User user) {
			
		sessionFactory.getCurrentSession().delete(user);
	}
	
	//로그인
	public List<User> login() {			
		return sessionFactory.getCurrentSession().createNativeQuery("select * from user", User.class).getResultList();
		
	}	
}
