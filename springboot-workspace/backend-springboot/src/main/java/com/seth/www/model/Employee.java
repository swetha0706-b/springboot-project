package com.seth.www.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data //setter getter
@Entity//table creation
@Table(name="employees")//class name change

public class Employee {
	@Id //primary key
	@GeneratedValue(strategy= GenerationType.IDENTITY)//auto_increment
	private Long id;
	@Column //normal columns
	private String firstName;//first_name
	@Column
	private String lastName;
	@Column
	private String email;

}
