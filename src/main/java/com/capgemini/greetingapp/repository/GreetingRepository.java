package com.capgemini.greetingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.greetingapp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {

}
