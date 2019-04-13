package com.myEruekaClient.fategame.controller;

import java.util.Arrays;
import java.util.List;

import com.fateapi.domain.Rtiuial;
import com.fateapi.domain.Servent;
import com.myEruekaClient.fategame.service.GetCards;
import com.myEruekaClient.util.RandomaArr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class Index {
	@Autowired
	private GetCards getCards;
	@RequestMapping("/GO")
	private ModelAndView Go() {
		return  new ModelAndView("Index");
	}
	@PostMapping("/Ten")
	private ModelAndView Ten() {
		ModelAndView mav = new ModelAndView();
		RandomaArr randomarr= new RandomaArr();
		int[] array = randomarr.Array();
		List<Servent> s = getCards.ServentCards(array);
		List<Rtiuial> r = getCards.RtiuialCards(array);
		mav.setViewName("Result");
		mav.addObject("Servent",s);
		mav.addObject("Rtiuial",r);
		s = null;
		r = null;
		return  mav;
	}
	@PostMapping("/One")
	private ModelAndView One() {
		return  new ModelAndView("Result");
	}
}
