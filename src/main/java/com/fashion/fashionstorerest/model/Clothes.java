package com.fashion.fashionstorerest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

//using lombok annotations
@Data
@NoArgsConstructor //default constructor
@AllArgsConstructor //Constructor for all properties
@Component
@Entity
public class Clothes {

    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String clothingType;
    private int size;
    private List<String> season;


    //Many Clothes to One store
    //This is the foreign key
    @ManyToOne
    @JoinColumn(name = "store_id")
    @JsonIgnoreProperties({"clothes"})
    private Store store;


    public void add(Clothes clothes) {

    }
} //last
