package com.data.data.service;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.BeanUtils;
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

	@Autowired
	DivisionRepository divisionRepository;

	public Department saveDepartment(Department department)

	{

		return departmentRepository.save(department);

	}

	public List<Department> fetchDepartment() {

		List<Department> department = new ArrayList<Department>();
		departmentRepository.findAll().forEach(department::add);
    return department;
    
	}

}
