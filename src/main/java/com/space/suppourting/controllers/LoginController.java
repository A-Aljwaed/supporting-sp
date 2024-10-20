package com.space.suppourting.controllers;

import com.space.suppourting.services.impls.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("name")
public class LoginController {
	

	
	@Autowired
	LoginService loginservice;

	@RequestMapping(value="/login" , method = RequestMethod.GET)
	//@ResponseBody
	public String loginPage() {
		return "login.html";
	}


	@RequestMapping(value="/login" , method = RequestMethod.POST)

	public String getLoginInfo(
			@RequestParam String name,
			@RequestParam String password,
			ModelMap model) {


		if(!loginservice.checkValidateUser(name, password)) {
			model.put("errorMsg", "Check your name and password");
			return "login.html";
		}

		model.put("name", name);
		model.put("password", password);
		return "home.html";
	}



	@RequestMapping(value="/home")
	public String homePage() {
		return "home.html";
	}

}
