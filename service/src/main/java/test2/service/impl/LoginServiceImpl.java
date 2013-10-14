package test2.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test2.dao.UserDao;
import test2.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Autowired
	private UserDao userDao;
	
//	@PostConstruct
//	public void init() {
//		System.out.println(this.userDao == null);
//	}
	public String ckeckUAndP(String username) {
//		System.out.println(this.userDao == null);
		return userDao.getUserByUAndP(username);
	}

}
