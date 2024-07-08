package com.fashion.fashionstorerest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class NormalUser {

    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Integer userContact;

    //parameterised constructor
    public NormalUser(String username, String password, Integer userContact) {
        this.username = username;
        this.password = password;
        this.userContact = userContact;
    }

    //default constructor
    public NormalUser() {
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserContact() {
        return userContact;
    }

    public void setUserContact(Integer userContact) {
        this.userContact = userContact;
    }
} //last
