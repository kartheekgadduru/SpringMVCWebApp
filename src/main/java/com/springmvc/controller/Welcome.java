package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Welcome  {

	@RequestMapping("/welcome.html")
	protected ModelAndView getWelcomePage()  {
		ModelAndView mv = new ModelAndView("Welcome");
		mv.addObject("message","Hello Kartheek, Welcome to spring mvc application");

		return mv;
	}

}
