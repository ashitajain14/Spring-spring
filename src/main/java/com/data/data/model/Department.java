package com.data.data.model;

import java.util.HashSet;
import java.util.Set;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;
import lombok.ToString;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Data
@ToString
// @AllArgsConstructor
// @NoArgsConstructor
public class Department {
    @Id
	@GeneratedValue
	private Long entityId;

	public String name;

	public String location;
	
	@Relationship(type = "is_divided_into", direction = Relationship.INCOMING)
	private Set<Divisions> divisions = new HashSet<Divisions>();
}