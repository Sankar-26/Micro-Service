package com.example.employee_service.service.impl;

import com.example.employee_service.dto.ApiResponseDto;
import com.example.employee_service.dto.DepartmentDto;
import com.example.employee_service.dto.EmployeeDto;
import com.example.employee_service.entity.Employee;
import com.example.employee_service.repository.EmployeeRepository;
import com.example.employee_service.service.ApiClient;
import com.example.employee_service.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    private ModelMapper modelMapper;
//    private RestTemplate restTemplate;
    private ApiClient apiClient;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee saveEmployee =modelMapper.map(employeeDto,Employee.class);
        return modelMapper.map(employeeRepository.save(saveEmployee),EmployeeDto.class);

    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {

         Employee employeeById = employeeRepository.findById(id).get();
         return modelMapper.map(employeeById,EmployeeDto.class);
    }

    @Override
    public ApiResponseDto getEmployeeAndDepartmentById(Long id) {

        EmployeeDto employeeDto = modelMapper.map(employeeRepository.findById(id).get(), EmployeeDto.class);

//        ResponseEntity<DepartmentDto> department =
//                restTemplate.getForEntity("http://localhost:8080/department/" + employeeDto.getDepartmentCode(), DepartmentDto.class);
//        DepartmentDto departmentDto = department.getBody();

        DepartmentDto departmentDto = apiClient.displayDepartmentByCode(employeeDto.getDepartmentCode());

        ApiResponseDto apiResponseDto =new ApiResponseDto();

        apiResponseDto.setEmployeeDto(employeeDto);
        apiResponseDto.setDepartmentDto(departmentDto);

        return apiResponseDto;
    }

}
