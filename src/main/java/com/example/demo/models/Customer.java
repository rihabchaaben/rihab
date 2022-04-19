package com.example.demo.models;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
//@DiscriminatorValue("Customer")
@Table(name = "customers")
public class Customer extends User {
	
	public Customer(String username, String email, String password, String fAdress, int phoneNum) {
		super(username, email, password, fAdress, phoneNum);
		// TODO Auto-generated constructor stub
	}
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	
	
	  //getters and setters
	 public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	public Customer( @Size(max = 20) String username, int phoneNum, @Size(max = 20) String fAdress, String image,
			@Size(max = 50) @Email String email, @Size(max = 120) String password, Set<Role>  set) {
		super(username, phoneNum, fAdress, image, email, password, set);
		// TODO Auto-generated constructor stub
	}
	public Customer() {}
}
