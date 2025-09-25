package com.employee.ems.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.ems.dto.EmployeeDto;
import com.employee.ems.service.EmployeeService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private EmployeeService employeeService;
	
	//Build Add Employee Rest Api
	
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
		EmployeeDto savedEmployeee = employeeService.createEmployeeService(employeeDto);
		return new ResponseEntity<>(savedEmployeee, HttpStatus.CREATED);
		
	}

}
