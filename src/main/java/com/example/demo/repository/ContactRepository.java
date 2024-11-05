package com.example.demo.repository;

import com.example.demo.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Contact, Long> indica che il repository è responsabile della gestione di entità di tipo Contact, 
// e che la chiave primaria è di tipo Long.
public interface ContactRepository extends JpaRepository<Contact, Long> {
    //  Spring Data JPA genera tutto automaticamente
}