package com.example.department_service.service.impl;

import com.example.department_service.dto.DepartmentDto;
import com.example.department_service.entity.Department;
import com.example.department_service.repository.DepartmentRepository;
import com.example.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private ModelMapper modelMapper;

    @Override
    public DepartmentDto createDepartment(DepartmentDto departmentDto) {

        Department saveDepartment = modelMapper.map(departmentDto,Department.class);
        departmentRepository.save(saveDepartment);
        return modelMapper.map(saveDepartment,DepartmentDto.class);

    }

    @Override
    public List<DepartmentDto> displayDepartment() {

        return  departmentRepository.findAll()
                .stream()
                .map(department -> modelMapper.map(department,DepartmentDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {

        Department getDepartment = departmentRepository.findByDepartmentCode(code);
        return modelMapper.map(getDepartment,DepartmentDto.class);

    }


}
