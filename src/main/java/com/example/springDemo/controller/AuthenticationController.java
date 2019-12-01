package com.example.springDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.springDemo.Service.AuthenticationService;
import com.example.springDemo.domain.APIResponse;
import com.example.springDemo.domain.AuthenticateMaster;

import io.swagger.annotations.ApiOperation;

@RestController
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;
	
	@GetMapping("/")
	public String displayValue() {
		return "Hi Micro service one";
	}

//	@ApiOperation(value = "This API used to authenticate user from database")
//	@PostMapping(value = "/user")
//	public APIResponse getUserDetails(@RequestBody AuthenticateMaster authenticationuser) {
//		APIResponse apiResponse = new APIResponse();
//		AuthenticateMaster userMasterObj = authenticationService.getUserDetails(authenticationuser);
//		if(userMasterObj != null) {
//			apiResponse.setData(userMasterObj);
//			apiResponse.setStatus("User Found");
//		}else {
//			apiResponse.setData(null );
//			apiResponse.setStatus("User Not Found");
//		}
//		return apiResponse;
//
//	}

}
