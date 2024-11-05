package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotEmpty(message = "Il nome è obbligatorio")
    private String name;

    @NotEmpty(message = "Il cognome è obbligatorio")
    private String surname;

    @NotEmpty(message = "L'email è obbligatoria")
    @Email(message = "Inserisci un'email valida")
    private String email;

    @NotNull(message = "Il budget è obbligatorio")
    private Double budget;

    private String description;

    // Costruttore senza argomenti
    public Contact() {}

    // Costruttore con argomenti
    public Contact(String name, String surname, String email, Double budget, String description) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.budget = budget;
        this.description = description;
    }

    // Getter e Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


	
	






    