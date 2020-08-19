package com.itstudy.cloudnoteserver.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	//select는 nativequery를 이용 

}
