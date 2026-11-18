package com.example.employee_management.mapper;

import org.springframework.stereotype.Component;

import com.example.employee_management.dto.request.EmployeeRequest;
import com.example.employee_management.dto.response.EmployeeResponse;
import com.example.employee_management.entity.Employee;

@Component 
public class EmployeeMapper {

    public EmployeeResponse toResponse(Employee employee){
        // new DTO object to hold data from entity and prepare  to send to client
        EmployeeResponse response = new EmployeeResponse();
        response.setId(employee.getId());
        response.setFirstName(employee.getFirstName());
        response.setEmail(employee.getEmail());
        response.setDepartment(employee.getDepartment());
        response.setSalary(employee.getSalary());

        return response;
    }

    public Employee toEntity(EmployeeRequest request){
        // new Entity object to hold data from request and prepare to save in db
        Employee employee = new Employee();
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());

        return employee;
    }

    public void  toUpdateEntity(Employee employee , EmployeeRequest request){
        EmployeeRequest existingEmployee = new EmployeeRequest();
        existingEmployee.setFirstName(request.getFirstName());
        existingEmployee.setLastName(request.getLastName());
        existingEmployee.setEmail(request.getEmail());
        existingEmployee.setDepartment(request.getDepartment());
        existingEmployee.setSalary(request.getSalary());

    }

}
