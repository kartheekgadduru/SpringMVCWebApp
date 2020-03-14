package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello.html")
	public ModelAndView getRequest(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView("HelloController");
		mv.addObject("message", " Welcome to a HelloContoller");
		return mv;
	}
}
