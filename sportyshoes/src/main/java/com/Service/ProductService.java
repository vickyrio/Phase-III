package com.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doa.ProductRepository;
import com.bean.Product;

@Service
public class ProductService {
	
	@Autowired
    ProductRepository productrepository; 
	
	public List<Product> getAllProducts(){
		if(productrepository.findAll()!=null) {
		return productrepository.findAll();}
		return null;
	}

	
	
	
	public String storeProducts(List<Product> product) {
		try {
			if(product!=null) {
		productrepository.saveAll(product);
		return "Products Stored Successfully ";}
		}
		catch (Exception e) {
			System.out.println("ERROR WHILE STORING PRODUCTS"+e);
			
		}
		return "Products didn't stored ";
	}
	
	
	public String updateProducts(List<Product> product) {
				
		try {
			
			if(product!=null) {
	          productrepository.saveAll(product);
	          return "Product Updated Successfully";
	          }
	          }
		catch(Exception e) {
			System.out.println("ERROR WHILE UPDATING PRODUCTS"+e);
	}
		return "Product Requested For Updated Not Found ";
	}
	
	
	
	public Optional<Product> getProductById(String product) {
		
		try{
			Optional<Product> p1=productrepository.findById(product);
			
		if(p1!=null) 
		  {
		return productrepository.findById(product);
		  }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;	
		
	}
	
	
	



	public String deleteProductById(String product) {
		// TODO Auto-generated method stub
		Boolean a= productrepository.existsById(product);
		
		try {
		
		if(product!=null && a.equals(true) ) {
		productrepository.deleteById(product);
		return "DELETED SUCCESSFULLY";
		  }
		  }
		catch(Exception e) {
			System.out.println("ERROR OCCCURING WHILE DELETING "+e);
		   }
		return "PRODUCT REQUESTED TO DELETE NOT FOUND ";
	}




	public List<Product> getByCatagory(String catagories) {
		// TODO Auto-generated method stub
		try {
			Boolean b = productrepository.existsBycatagories(catagories);

			if(catagories!=null && b.equals(true) )
			{
		return productrepository.findBycatagories(catagories);
		
			}
		}catch(Exception e) {
			System.out.println("ERROR OCCCURING FETCHING CATAGORIES "+e);
		}
		return null;
	}





	public List<Product> getBrand(String brand) {
		// TODO Auto-generated method stub
		try {
			
		Boolean b = productrepository.existsBybrand(brand);
		
		if(brand!=null && b.equals(true)) 
		{
			
		return productrepository.findBybrand(brand);
		}
		}catch(Exception e) {
			System.out.println("ERROR OCCCURING FETCHING BRAND "+e);

		}
		return null;
	}




	public List<Product> getSize(Integer sz) {
		// TODO Auto-generated method stub
		Boolean b = productrepository.existsBysz(sz);	
		try {
			
			
			if(sz!=null && b.equals(true)) 
			{
				
			return productrepository.findBysz(sz);
			}
			}catch(Exception e) {
				System.out.println("ERROR OCCCURING FETCHING BRAND "+e);

			}
			return null;
		
	}
}

