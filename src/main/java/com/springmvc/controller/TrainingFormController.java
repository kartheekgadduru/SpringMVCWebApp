package com.springmvc.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TrainingFormController {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormate = new SimpleDateFormat("DD-MM-YYYY");
		binder.registerCustomEditor(Date.class,"dob" , new CustomDateEditor(dateFormate, false));
	}

	@RequestMapping("/trainingform.html")
	public ModelAndView getTraingform() {
		ModelAndView mv = new ModelAndView("TrainingForm");
		return mv;
	}


	@RequestMapping("/submitform.html")
	public ModelAndView getSucessMessage(@ModelAttribute("student") Student student, BindingResult data) {
		ModelAndView model = null;
		if(data.hasErrors()) {
			model = new ModelAndView("TrainingForm");
		}
		else {
			model=  new ModelAndView("Sucess");
		}
		return model;

	}

}
