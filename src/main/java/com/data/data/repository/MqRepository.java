package com.data.data.repository;

import com.data.data.model.Mq;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface MqRepository extends Neo4jRepository<Mq, Long> {

}