package com.myEruekaClient.fategame.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Hello {
	
	@RequestMapping("/")
	private ModelAndView hello() {
		return  new ModelAndView("Hello");
	}
	@RequestMapping("/copy")
	private void  copy() {
		
	}
	

}
