package com.example.employee_management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.ApiResponse;
import com.example.employee_management.dto.response.EmployeeResponse;
import com.example.employee_management.entity.Employee;
import com.example.employee_management.mapper.EmployeeMapper;
import com.example.employee_management.repository.EmployeeRepository;
import com.example.employee_management.service.EmployeeService;

@Service 
public class EmployeeServiceImpl implements EmployeeService {
    
    // @Autowired
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    
    // constructor injection
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }
    

    @Override
    public ApiResponse<EmployeeResponse> create(EmployeeRequest request) {
        Employee employee = employeeMapper.toEntity(request);
        Employee saved = employeeRepository.save(employee);

        return employeeMapper.toResponse(saved);
        
    }

    @Override
    public ApiResponse<List<EmployeeResponse>> getAll() {
        
    }

    @Override
    public EmployeeResponse getById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public EmployeeResponse update(Long id, EmployeeRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }


}
