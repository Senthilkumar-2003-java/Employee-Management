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


// dummy
//
//package com.employee.ems.service;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.employee.ems.dto.EmployeeDto;
//import com.employee.ems.entity.Employee;
//import com.employee.ems.mapper.EmployeeMapper;
//import com.employee.ems.repository.EmployeeRepository;
//
//@Service
//public class EmployeeServiceImpl implements EmployeeService {
//
//    private final EmployeeRepository employeeRepository;
//
//    // constructor injection
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @Override
//    @Transactional
//    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
//        // Convert DTO to entity
//        Employee entity = EmployeeMapper.toEntity(employeeDto);
//        // Save entity
//        Employee saved = employeeRepository.save(entity);
//        // Convert entity back to DTO
//        return EmployeeMapper.toDto(saved);
//    }
//
//	@Override
//	public EmployeeDto createEmployeeService(EmployeeDto employeeDto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}
