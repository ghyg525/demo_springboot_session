package org.yangjie.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
	
	@GetMapping("/test")
	public @ResponseBody Object test(HttpSession session) {
		Object obj = session.getAttribute("test");
		if (obj == null) {
			session.setAttribute("test", System.currentTimeMillis());
		}
		return obj;
	}	
	
}
