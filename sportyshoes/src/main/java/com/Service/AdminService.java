package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doa.AdminInterafce;
import com.Doa.UserInterface;
import com.bean.Admin;
import com.bean.User;


@Service
public class AdminService {

	@Autowired
	AdminInterafce admininterface;
	
	@Autowired
	UserInterface userinterface;
	
	public String storeUser(List<Admin> admin) {
		// TODO Auto-generated method stub
		try {
			if(admin!=null) {
		admininterface.saveAll(admin);
		return "ACCOUNT CREATED SUCCESSFULLY";}
		}
		catch (Exception e) {
			System.out.println("ERROR WHILE STORING ACCOUNT DETAILS"+e);
			
		}
		return "ACCOUNT CREATION FAILED";
		
	}

	public String updateUser(List<Admin> admin) {
		// TODO Auto-generated method stub
	      try {
			
			if(admin!=null) {
	          admininterface.saveAll(admin);
	          return "ACCOUNT Password Updated Successfully";
	          }
	          }
		catch(Exception e) {
			System.out.println("ERROR WHILE UPDATING ACCOUNT"+e);
	}
		return "ACCOUNT Requested For Updated Not Found ";
	}
	
	public String adminSignIn(String admincode, String password) {
		try {
		Boolean adminid = admininterface.existsByadmincode(admincode);
		Boolean pass = admininterface.existsBypassword(password);
		if(adminid.equals(true) && pass.equals(true) )
		return "PASSWORD ACCEPTED    **** WELCOME TO ADMIN PAGE ****";
		else if(adminid.equals(false) && pass.equals(true))
			return "INCORRECT ADMIN ID";
		else if (adminid.equals(true) && pass.equals(false))
			return "INCORRECT PASSOWORD";}
		catch(Exception e) {}
		return "PLEASE ENTER THE CORRECT ADMIN_ID AND PASSWORD";
	}

	/* public List<User> getAllUsers(List<User> user) {
		// TODO Auto-generated method stub
		
		
		return userinterface.findAllByusername(user);
	} */

	

	

	

	

}
