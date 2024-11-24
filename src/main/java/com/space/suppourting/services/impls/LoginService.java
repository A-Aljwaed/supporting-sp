package com.space.suppourting.services.impls;

import com.space.suppourting.services.LogingService;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.View;

import java.util.regex.Pattern;


@Service
public class LoginService implements LogingService {


	private final View error;

	public LoginService(View error) {
		this.error = error;
	}

	@Override
	public boolean checkValidateUser(String name,String password) {
		if(name.equals("admin") ) {
			return true;
		}else {
			return false;
		}
	}



	@Override
	public String logArt(String status) {



		String trimmedStatus = status.trim().toLowerCase();
		if (trimmedStatus.length() > 10) {

			return null;
		}
		String regex = "(admin|Student|unschueler|Azubi)";


		if (status != null && Pattern.matches(regex, status)) {

			status =status.toLowerCase();
		} else {

			return null;
		}

		return status;
	}



}
