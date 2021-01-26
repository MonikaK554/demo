package com.example.repository;

import com.example.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {

        List<Person> findAll();

    Person save(Person entity);

    Person getOne(Long id);






}
