package com.data.data.repository;

import com.data.data.model.Services;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ServicesRepository extends Neo4jRepository<Services, Long> {

}