package com.filiperibolli.dashboardAdministrator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SistemaController {
	
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public ModelAndView boasVindas() {
		 
		ModelAndView modelAndView = new ModelAndView("menu");
		return modelAndView;
	}
}