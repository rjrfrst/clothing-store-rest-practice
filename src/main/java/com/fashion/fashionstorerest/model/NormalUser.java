package com.fashion.fashionstorerest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

    //relationship with the address
    //A user (or many users can have one address)
    @OneToMany(mappedBy = "normaluser")
    @JsonIgnoreProperties({"normaluser"})
    private List<Address> addresses = new ArrayList<>();


    //parameterised constructor
    public NormalUser(String username, String password, Integer userContact) {
        this.username = username;
        this.password = password;
        this.userContact = userContact;
        this.addresses = new ArrayList<>();
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
} //last
