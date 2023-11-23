package com.shopme.common.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "users" )
public class User {
	
	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String photos;
	private boolean enabled;
}
