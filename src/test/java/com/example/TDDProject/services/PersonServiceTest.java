package com.example.TDDProject.services;

import com.example.TDDProject.entities.Person;
import com.example.TDDProject.repositories.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    void shouldReturnAllPeopleWhenCalled()
    {
        Integer expectedResult = 1;

        Integer actualResult = personService.getAll().size();

        assertEquals(expectedResult, actualResult);
    }

}
