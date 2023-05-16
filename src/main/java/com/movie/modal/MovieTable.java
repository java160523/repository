package com.movie.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class MovieTable {
	
	@Id
	private int movieId;
	private String movieName;
	private double ticketPrice;
	
	@OneToMany
	private List<Employee> employee;
	

	

	

}
