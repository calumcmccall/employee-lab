package com.codeclan.example.employees;

import com.codeclan.example.employees.models.Employee;
import com.codeclan.example.employees.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeesApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee employee = new Employee("Tom", 45, 1234, "tom123@gmail.com");
		employeeRepository.save(employee);
	}

}
