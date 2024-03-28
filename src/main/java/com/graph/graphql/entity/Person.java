package com.graph.graphql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tbl_person")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person
{
    @Id
    private long id;

    private String name;

    private String address;

    private String cellNumber;

    private  String email;

    private String password;
}
