package com.data.data.model;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Data
@ToString
// @AllArgsConstructor
@NoArgsConstructor
// @EqualsAndHashCode(exclude="entityId")
public class Divisions {
	// @Id
	// @GeneratedValue
	// private Long entityId;

	@Id
	public String name;
	@Relationship(type = "has_functionality", direction = Relationship.INCOMING)
	private Set<Functionality> functionality = new HashSet<Functionality>();
}