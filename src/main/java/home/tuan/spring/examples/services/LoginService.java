package home.tuan.spring.examples.services;

import home.tuan.spring.examples.data.LoginRepository;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean checkLogin(final String userName, final String password){
		LoginRepository loginData = new LoginRepository();
		return loginData.checkLogin(userName, password);
	}
}
