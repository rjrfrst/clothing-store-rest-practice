package com.fashion.fashionstorerest.model;

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
public class Clothes {

    //properties
    private long id;
    private String clothingType;
    private int size;
    private List<String> season;

} //last
