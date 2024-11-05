package com.example.employee_service.service;

import com.example.employee_service.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "DEPARTMENT-SERVICE",url = "http://localhost:8080")
@FeignClient(name = "DEPARTMENT-SERVICE")
public interface ApiClient {

    @GetMapping("department/{code}")
    DepartmentDto displayDepartmentByCode(@PathVariable("code") String code);
}
