package com.girish.UserManagementApp.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Uid;
	private String Fname;
	private String Lname;
	private String Email;
	private long   Phno;
	private LocalDate Dob;
	private String Gender;
	private String Country;
	private String State;
	private String City;
	private String ActiveSwitch;
	private String Password;
	private LocalDate createddate;
	private LocalDate updateddate;
	

}
