package com.example.department_service.controller;


import com.example.department_service.dto.DepartmentDto;
import com.example.department_service.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/department")
public class DepartmentController {

    private DepartmentService departmentService;

    @PostMapping
    private ResponseEntity<DepartmentDto> createDepartment(@RequestBody DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentService.createDepartment(departmentDto), HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<DepartmentDto>> displayAllDepartment(){
        return new ResponseEntity<>(departmentService.displayDepartment(), HttpStatus.OK);
    }

    @GetMapping("{code}")
    private ResponseEntity<DepartmentDto> displayDepartmentByCode(@PathVariable("code") String code){
        return new ResponseEntity<>(departmentService.getDepartmentByCode(code), HttpStatus.OK);
    }

}
