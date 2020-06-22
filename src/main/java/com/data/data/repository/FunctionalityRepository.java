package com.data.data.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.data.data.model.Functionality;

public interface FunctionalityRepository extends Neo4jRepository<Functionality, Long> {

}