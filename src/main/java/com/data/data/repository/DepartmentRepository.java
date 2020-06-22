package com.data.data.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.data.model.Department;

public interface DepartmentRepository extends Neo4jRepository<Department,Long>{
	//@Query("MATCH (n) RETURN n")
    //List<Department> loadAll();
	//@Query("MATCH (u:Department)<-[r:has_division]-(m:Divisions) RETURN u,r,m")
	//List<Department> loadAll();
}