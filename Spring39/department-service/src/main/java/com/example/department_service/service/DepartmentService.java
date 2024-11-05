package com.example.department_service.service;

import com.example.department_service.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {

    DepartmentDto createDepartment(DepartmentDto departmentDto);

    List<DepartmentDto> displayDepartment();

    DepartmentDto getDepartmentByCode (String code);

}
