package com.wadago.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/model")
public class ModelController {

	@GetMapping("/try")
	public ModelAndView modelTry(ModelAndView model) {
		
		model.setViewName("/model/try");
		
		return model;
	}
	@GetMapping("/introduce")
	public ModelAndView modelIntroduce(ModelAndView model) {
		
		model.setViewName("/model/introduce");
		
		return model;
	}

}
