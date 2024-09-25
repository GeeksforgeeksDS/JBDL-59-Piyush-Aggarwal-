package com.example.demoapis.dto;

import com.example.demoapis.models.Address;
import com.example.demoapis.models.Department;
import com.example.demoapis.models.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
public class UpdateEmployeeRequest {

    @NotBlank
    private String name;

    @Min(18)
    @Max(60)
    private int age;

    @NotNull
    private Department department;

    private Address address;

     public Employee to(String employeeId){

         return Employee.builder()
                 .name(this.name)
                 .age(this.age)
                 .department(this.department)
                 .address(this.address)
                 .updatedOn(System.currentTimeMillis())
                 .id(employeeId)
                 .build();
    }
}
