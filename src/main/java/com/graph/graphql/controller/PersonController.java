package com.graph.graphql.controller;

import com.graph.graphql.entity.Person;
import com.graph.graphql.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @QueryMapping
    public List<Person> getAll()
    {
        return personService.getAll();
    }

    @QueryMapping
    public Person getById(@Argument long id)
    {
        return personService.getById(id);
    }

    @MutationMapping
    public Person savePerson(@Argument long id,@Argument String name,@Argument String address,
                           @Argument String cellNumber,@Argument String email,@Argument String password)
    {
        return this.personService.savePerson(id,name,address,cellNumber,email,password);
    }
}
