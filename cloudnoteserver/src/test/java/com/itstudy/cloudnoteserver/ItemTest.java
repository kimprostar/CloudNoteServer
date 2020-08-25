package com.itstudy.cloudnoteserver;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.itstudy.cloudnoteserver.dao.TemplateDAO;
import com.itstudy.cloudnoteserver.dao.UserDAO;
import com.itstudy.cloudnoteserver.dao.UserbuyDAO;
import com.itstudy.cloudnoteserver.domain.Template;
import com.itstudy.cloudnoteserver.domain.User;
import com.itstudy.cloudnoteserver.domain.Userbuy;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })

public class ItemTest {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private UserDAO userDao;
	@Autowired
	private TemplateDAO templateDao;
	@Autowired
	private UserbuyDAO userbuyDao;
	
	
	@Test
	@Transactional
	public void sqlSessionTest() throws Exception { 
		 //데이터베이스 연결 테스트
		 //System.out.println(sessionFactory.toString());
		
		//UserDAO 연결 테스트
		 User user = new User();
		 user.setId("ggangpae1");
		 user.setNickname("군계");
		 user.setPassword("1234");
		
		 //userDao.login();
		 //userDao.delete(user);
		 //userDao.insert(user);
		
		 
		//TemplateDAO 연결 테스트
		Template template = new Template();
		template.setFileid(1);
		template.setUserid("kkjj127");
		template.setFiledate("201200825");
		template.setFilecontent("상세보기 설명");
		template.setImage("이미지");
		template.setFileadd("첨부파일 경로");
		template.setDownload(3);
		template.setFilelike(5);
		
		templateDao.filecontent(1);
		templateDao.filelist();
		templateDao.insert(template);
		
		
		//UserbuyDAO 연결	 테스트
		userbuyDao.fileidlist("kkjj127");
		
		
	}
}

