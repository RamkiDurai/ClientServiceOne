package com.example.springDemo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springDemo.domain.AuthenticateMaster;

@Repository
public interface AuthenticateDAO extends JpaRepository<AuthenticateMaster, Long>{
	
	public AuthenticateMaster findByUserNameAndPassword(String AuthenticateMasteruserName, String password);

}
