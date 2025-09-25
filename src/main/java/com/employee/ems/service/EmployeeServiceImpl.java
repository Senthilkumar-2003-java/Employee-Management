package com.employee.ems.service;

import org.springframework.stereotype.Service;

import com.employee.ems.dto.EmployeeDto;
import com.employee.ems.entity.Employee;
import com.employee.ems.mapper.EmployeeMapper;
import com.employee.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployeeService(EmployeeDto employeeDto) {

		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee createEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(createEmployee);
	}

}
