package com.demo.Springboot_CURD_REST.repository;

import com.demo.Springboot_CURD_REST.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
