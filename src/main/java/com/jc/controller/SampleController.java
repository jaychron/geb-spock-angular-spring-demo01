package com.jc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {

	@RequestMapping("/spring/")
	public String loadHomePage(final Model m) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication ==null ? "null" : authentication.getPrincipal();
		m.addAttribute("name", principal);
		return "home";
	}
}
