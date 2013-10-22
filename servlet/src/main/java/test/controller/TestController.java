package test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test2.service.LoginService;

@Controller
public class TestController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/test/index")
	public String handle(HttpServletRequest request, Model model) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String password1 = loginService.ckeckUAndP(username);
		if (password1.equals(password)) {
			return "index";
			
		}else{
			request.setAttribute("message", "用户名或密码错误！！");
			return "message";
		}
	}
}
