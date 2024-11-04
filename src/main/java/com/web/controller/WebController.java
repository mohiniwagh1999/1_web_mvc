package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@GetMapping("/welcome")
	public ModelAndView getMsg()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","welcome to ashok it");
		mv.setViewName("index");
		return mv;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreet()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","good morning");
		mv.setViewName("index");
		return mv;
	}
	
}
