package com.example.springDemo.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springDemo.DAO.AuthenticateDAO;
import com.example.springDemo.domain.AuthenticateMaster;

@Service
@Transactional
public class AuthenticationService {

	@Autowired
	private AuthenticateDAO authenticateDAO;

	public AuthenticateMaster getUserDetails(AuthenticateMaster authenticationuser) {
		// TODO Auto-generated method stub
		return authenticateDAO.findByUserNameAndPassword(authenticationuser.getUserName(),
				authenticationuser.getPassword());
	}

}
