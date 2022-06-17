package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Contact;

public interface Repository extends JpaRepository<Contact, Integer> {

}
