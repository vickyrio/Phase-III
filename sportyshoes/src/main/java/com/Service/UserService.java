package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doa.ProductRepository;
import com.Doa.UserInterface;
import com.bean.Product;
import com.bean.User;
@Service
public class UserService {

	@Autowired
	UserInterface userinterface;
	
	@Autowired
	ProductRepository productrepository;
	
	public String storeUser(List<User> user) {
		// TODO Auto-generated method stub
		try {
			if(user!=null) {
	        userinterface.saveAll(user);
		return "USER ACCOUNT CREATED SUCCESSFULLY";}
		}
		catch (Exception e) {
			System.out.println("ERROR WHILE STORING ACCOUNT DETAILS"+e);
			
		}
		return "USER ACCOUNT CREATION FAILED";
	}

	public String updateUser(List<User> user) {
		// TODO Auto-generated method stub
		 try {
				
				if(user!=null) {
		          userinterface.saveAll(user);
		          return "USER ACCOUNT Password Updated Successfully";
		          }
		          }
			catch(Exception e) {
				System.out.println("ERROR WHILE UPDATING ACCOUNT"+e);
		}
			return "USER ACCOUNT Requested For Updated Not Found ";
	}

	public String userSignIn(String username, String password) {
		try {
			Boolean user = userinterface.existsByusername(username);
			Boolean pass = userinterface.existsBypassword(password);
			if(user.equals(true) && pass.equals(true) )
			return "PASSWORD ACCEPTED    **** WELCOME TO USER PAGE ****";
			else if(user.equals(false) && pass.equals(true))
				return "INCORRECT USER ID";
			else if (user.equals(true) && pass.equals(false))
				return "INCORRECT PASSOWORD";}
			catch(Exception e) {}
			return "PLEASE ENTER THE CORRECT USER_ID AND PASSWORD";
		}


	
            public List<Product> getAllProducts(){
		        if(productrepository.findAll()!=null) {
		       return productrepository.findAll();}
				return null;
		        
	}
	}


