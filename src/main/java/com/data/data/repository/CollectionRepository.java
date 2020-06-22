package com.data.data.repository;

import com.data.data.model.Collection;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface CollectionRepository extends Neo4jRepository<Collection, Long> {

}