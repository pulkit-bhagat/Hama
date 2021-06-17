package com.example.hama.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hama.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
