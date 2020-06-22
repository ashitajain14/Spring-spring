package com.data.data.service;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.BeanUtils;
//import org.apache.tomcat.util.security.PrivilegedSetTccl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.data.model.Department;
import com.data.data.model.Divisions;
import com.data.data.model.Functionality;
import com.data.data.repository.DepartmentRepository;
import com.data.data.repository.DivisionRepository;

@Service
public class DivisionService {
	@Autowired
	private DivisionRepository divisionRepository;

	@Autowired
	Functionality FunctionalityRepository;

	public Divisions saveDepartment(Divisions division)

	{

		return divisionRepository.save(division);

	}

	public List<Department> fetchDepartment() {

		List<Divisions> division = new ArrayList<Divisions();
		divisionRepository.findAll().forEach(department::add);
    return department;
    
	}

}