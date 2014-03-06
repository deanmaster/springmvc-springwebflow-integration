package home.tuan.spring.examples.controller;

import home.tuan.spring.examples.services.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/loginProcess")
	public ModelAndView loginProcess(
			@RequestParam(value = "u", required = true) String userName,
			@RequestParam(value = "p", required = true) String password) {
		if (loginService.checkLogin(userName, password)){
			ModelAndView loginView = new ModelAndView("login");
			return loginView;
		}
		return null;
	}
}
