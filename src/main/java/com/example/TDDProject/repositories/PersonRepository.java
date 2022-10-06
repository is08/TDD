package com.example.TDDProject.repositories;

import com.example.TDDProject.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
