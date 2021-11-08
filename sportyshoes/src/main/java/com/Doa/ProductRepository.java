package com.Doa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bean.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>  {

public List<Product> findBycatagories(String catagories); //findBy<classname>

public List<Product> findBybrand(String brand);  // findBy <brand>

public List<Product> findBysz(Integer sz);    // findBy <sz>

public Boolean existsBysz(Integer sz);

public Boolean existsBybrand(String brand);

public Boolean existsBycatagories(String catagories);
	



	

	
	

	
}
