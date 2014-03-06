package home.tuan.spring.examples.services;

import home.tuan.spring.examples.data.LoginData;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean checkLogin(final String userName, final String password){
		LoginData loginData = new LoginData();
		return loginData.checkLogin(userName, password);
	}
}
