package com.example.TDDProject.repositories;

import com.example.TDDProject.entities.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void shouldReturnTrueWhenIdOfARegisteredPersonIsGiven(){
        Person isha = new Person(1, "Isha", "Patna");
        personRepository.save(isha);

        boolean actualResult = personRepository.existsById(isha.getPersonId());

        assertTrue(actualResult);
    }
}
