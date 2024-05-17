package com.fashion.fashionstorerest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
public class Store {

    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String storeName;

    private String address;

    private int contactNumber;

    @OneToMany(mappedBy = "store")
    @JsonIgnoreProperties({"store"})
    private List<Clothes> clothes;

    //parameterised constructor
    public Store(String storeName, String address, int contactNumber) {
        this.storeName = storeName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.clothes = new ArrayList<>();
    }

    //default constructor
    public Store() {
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public List<Clothes> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothes> clothes) {
        this.clothes = clothes;
    }


} //last
