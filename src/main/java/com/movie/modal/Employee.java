package com.movie.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	
	
}
