package com.example.TDDProject.services;

import com.example.TDDProject.entities.Person;
import com.example.TDDProject.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll(){
        return personRepository.findAll();
    }

}
