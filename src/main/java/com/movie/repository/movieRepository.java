package com.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.movie.modal.Employee;

@Repository
public interface movieRepository extends JpaRepository<Employee, Integer> {

}
