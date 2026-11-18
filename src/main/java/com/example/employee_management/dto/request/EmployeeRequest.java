package com.example.employee_management.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@NoArgsConstructor 

public class EmployeeRequest {
    @NotBlank(message = "First name is required!")
    private String firstName;

    @NotBlank(message = "Last name is required!")
    private String lastName;
    
    @Email
    @NotBlank(message = "Email is required!")
    private String email;
    
    @NotBlank(message = "Department is required")
    private String department;

    @NotNull(message = "Salary is required")
    private double salary;
}
