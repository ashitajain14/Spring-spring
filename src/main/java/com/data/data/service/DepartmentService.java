package com.data.data.service;

//import org.apache.tomcat.util.security.PrivilegedSetTccl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.data.model.Department;
import com.data.data.repository.DepartmentRepository;
import com.data.data.repository.DivisionRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired DivisionRepository divisionRepository;
    public Department saveDepartment(Department department) 
    
    {
        
		return departmentRepository.save(department);
	}
    
}
