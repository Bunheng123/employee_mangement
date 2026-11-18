package com.example.employee_management.service;

import java.util.List;

import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.ApiResponse;
import com.example.employee_management.dto.response.EmployeeResponse;

public interface EmployeeService {
    ApiResponse<EmployeeResponse> create(EmployeeRequest request);
    ApiResponse<List<EmployeeResponse>> getAll();
    ApiResponse<EmployeeResponse> getById(Long id);
    ApiResponse<Void> deleteById(Long id);
    ApiResponse<EmployeeResponse> update(Long id, EmployeeRequest request);
    

}
