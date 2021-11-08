package com.Doa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Admin;

@Repository
public interface AdminInterafce extends JpaRepository<Admin, String> {

	public Boolean existsByadmincode(String admincode);

	public Boolean existsBypassword(String password);




}
