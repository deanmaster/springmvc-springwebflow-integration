package home.tuan.spring.examples.data;

public class LoginData {
	public boolean checkLogin(final String userName, final String password) {
		return "userName".equals(userName) && "password".equals(password);
	}
}
