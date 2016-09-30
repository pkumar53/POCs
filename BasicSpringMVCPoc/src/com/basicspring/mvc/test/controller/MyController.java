package com.basicspring.mvc.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	
	@RequestMapping(value="success")
	public ModelAndView displaySuccessPage() {
		return new ModelAndView("/jsp/success.jsp");
	}
}
