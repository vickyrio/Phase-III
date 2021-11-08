package com.Controller;

import java.util.List;
import java.util.Optional;

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
import com.Service.ProductService;
import com.bean.Admin;
import com.bean.Product;

@RestController
@RequestMapping ("api/admin/addProducts")
public class ProductController {
	
	@Autowired
	ProductService productservice;
	
	
	
	
	
	// http://localhost:9090/api/admin/addProducts/ViewProducts
	@GetMapping(value="ViewProducts" ,
			produces = MediaType.APPLICATION_JSON_VALUE  )
	public List<Product> getAllProducts(){
		return productservice.getAllProducts();
	}
	
	
	
	// http://localhost:9090/api/admin/addProducts/storeproducts
	@PostMapping(value="storeproducts",
			consumes = MediaType.APPLICATION_JSON_VALUE   )
	public String storeProducts(@RequestBody List<Product> product) {
		
		 return productservice.storeProducts(product);
	}
	
	
	//http://localhost:9090/api/admin/addProducts/updateproduct
	@PutMapping(value="updateproduct",consumes = MediaType.APPLICATION_JSON_VALUE  )
	public String updateProducts(@RequestBody List<Product> product) {
		
		return productservice.updateProducts(product);
		
	}
	
	// http://localhost:9090/api/admin/addProducts/getproductbyid
	@GetMapping(value="getproductbyid/{id}",
			produces=MediaType.APPLICATION_JSON_VALUE  )	
	public Optional<Product> getProductById(@PathVariable("id") String product) {
		return productservice.getProductById(product);
		
	}
	
	// http://localhost:9090/api/admin/addProducts/deleteproductbyid
	@GetMapping(value="deleteproductbyid/{id}"  )
	public String deleteProducts(@PathVariable("id") String product) {
		return productservice.deleteProductById(product);
	}
	 
	// http://localhost:9090/api/admin/addProducts/getbycatagory
	@GetMapping(value="getbycatagory/{catagory}")
	public List<Product> getByCatagory(@PathVariable("catagory") String catagory){
		return productservice.getByCatagory(catagory);
	}
	
	//http://localhost:9090/api/admin/addProducts/getbrand
    @GetMapping(value = "getbrand/{brand}")
	public List<Product> getBrand(@PathVariable("brand") String brand){
		return productservice.getBrand(brand);
	}
	
  //http://localhost:9090/api/admin/addProducts/getsize
    @GetMapping(value="getsize/{sz}")
    public List<Product> getSize(@PathVariable("sz") Integer sz){
    	return productservice.getSize(sz);
    }
    
   

}
