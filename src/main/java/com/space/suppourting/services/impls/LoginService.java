package com.space.suppourting.services.impls;

import com.space.suppourting.services.LogingServiceimpl;
import org.springframework.stereotype.Service;


@Service
public class LoginService implements LogingServiceimpl {

	@Override
	public boolean checkValidateUser(String name,String password) {
		if(name.equals("Ahmad") && password.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}

}
