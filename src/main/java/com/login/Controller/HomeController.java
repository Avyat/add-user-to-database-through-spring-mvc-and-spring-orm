package com.login.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.Input.Input;
import com.login.InputLayer.ServiceLayer;

@Controller
public class HomeController {
	
	@Autowired

	private ServiceLayer service;
	
	@RequestMapping("/display")
	public String display() {
		return "display";
	}
	
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String data(@ModelAttribute Input input,Model model) {
		System.out.println(input);
		this.service.createInput(input);
		return "data";
	}
}
