package com.fashion.fashionstorerest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private long id;
    private String clothingType;
    private int size;
    private List<String> season;

    public void add(Clothes clothes) {

    }
} //last
