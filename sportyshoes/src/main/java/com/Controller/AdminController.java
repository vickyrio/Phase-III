package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Service.AdminService;
import com.bean.Admin;
import com.bean.Product;
import com.bean.User;



@RestController
@RequestMapping("api/admin")
public class AdminController  {
	
	
	
	@Autowired
	AdminService adminservice;
	
	// http://localhost:9090/api/admin/signup/createadmin 
	
	@PostMapping(value="signup/createadmin",
			consumes = MediaType.APPLICATION_JSON_VALUE   )
	public String storeUser(@RequestBody List<Admin> admin) {
		
		 return adminservice.storeUser(admin);
	}
	

	//http://localhost:9090/api/admin/updateadmin
	
	@PutMapping(value="updateadmin",consumes = MediaType.APPLICATION_JSON_VALUE  )
	public String updateUser(@RequestBody List<Admin> admin) {
		
		return adminservice.updateUser(admin);
		
	}
	

	// http://localhost:9090/api/admin/signin
	@GetMapping(value="signin/{admincode}/{password}" )
	public String adminSignIn(@PathVariable("admincode") String admincode ,@PathVariable("") String password) {
		String adsign = adminservice.adminSignIn(admincode,password);
		return adsign;
	}
	
	 /*  // http://localhost:9090/api/admin/userslist
			@GetMapping(value="userslist",produces = MediaType.APPLICATION_JSON_VALUE  )
			public List<User> getAllUsers(List<User> user){
				return adminservice.getAllUsers(user);
			} */
	
	
}



	


