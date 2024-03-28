package com.graph.graphql.repository;

import com.graph.graphql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {

    @Query(value = "select * from tbl_person", nativeQuery = true)
    List<Person> getAll();
}
