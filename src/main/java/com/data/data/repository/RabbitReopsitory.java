package com.data.data.repository;

import com.data.data.model.Rabbit;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface RabbitReopsitory extends Neo4jRepository<Rabbit, Long> {

}