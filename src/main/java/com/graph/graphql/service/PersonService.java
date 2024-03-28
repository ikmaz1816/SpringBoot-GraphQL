package com.graph.graphql.service;

import com.graph.graphql.entity.Person;
import com.graph.graphql.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonService
{
   @Autowired
   private PersonRepository personRepository;

   public List<Person> getAll()
   {
       return personRepository.getAll();
   }

   public Person getById(long id)
   {
       return personRepository.findById(id).get();
   }

   public Person savePerson(long id,String name,String address,String cellNumber,String email,String password)
   {
       Person person=new Person(id,name,address,cellNumber,email,password);
       return this.personRepository.save(person);
   }


}
