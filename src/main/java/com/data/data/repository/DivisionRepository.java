package com.data.data.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.data.model.Divisions;

public interface DivisionRepository extends Neo4jRepository<Divisions, Long> {

}