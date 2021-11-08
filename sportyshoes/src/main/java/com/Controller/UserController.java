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

import com.Service.UserService;
import com.bean.Product;
import com.bean.User;

@RestController
@RequestMapping("api/user")
public class UserController {

	
	@Autowired
	UserService userservice;
	
	
	
	// http://localhost:9090/api/user/createuser
	
		@PostMapping(value="createuser",
				consumes = MediaType.APPLICATION_JSON_VALUE   )
		public String storeUser(@RequestBody List<User> user) {
			
			 return userservice.storeUser(user);
		}
		

		//http://localhost:9090/api/user/updateuserpassword
		
		@PutMapping(value="updateuserpassword",consumes = MediaType.APPLICATION_JSON_VALUE  )
		public String updateUser(@RequestBody List<User> user) {
			
			return userservice.updateUser(user);
			
		}
		
		// http://localhost:9090/api/user/signin//
		@GetMapping(value="signin/{username}/{password}" )
		public String userSignIn(@PathVariable("username") String username ,@PathVariable("password") String password) {
			String ussign = userservice.userSignIn(username,password);
			return ussign;
		}
		
		// http://localhost:9090/api/user/ViewProducts
		@GetMapping(value="ViewProducts" ,
				produces = MediaType.APPLICATION_JSON_VALUE  )
		public List<Product> getAllProducts(){
			return userservice.getAllProducts();
		}
		
	
}
