package com.data.data.model;

import java.util.HashSet;
import java.util.Set;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
@Data
@ToString
// @AllArgsConstructor
@NoArgsConstructor
public class Services {
    @Id
    public String name;

    public String project_id;

    public String gitlab_url;

    @Relationship(type = "has_oracle_db", direction = Relationship.INCOMING)
    private Set<Oracle> oracle = new HashSet<Oracle>();
    @Relationship(type = "has_mongo_db", direction = Relationship.INCOMING)
    private Set<Mongo> mongo = new HashSet<Mongo>();
    @Relationship(type = "RMQ", direction = Relationship.INCOMING)
    private Set<Rabbit> rabbit = new HashSet<Rabbit>();
}