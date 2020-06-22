package com.data.data.repository;

import com.data.data.model.Mongo;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MongoRepository extends Neo4jRepository<Mongo, Long> {

}