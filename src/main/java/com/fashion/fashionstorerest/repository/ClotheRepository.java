package com.fashion.fashionstorerest.repository;

import com.fashion.fashionstorerest.model.Clothes;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class ClotheRepository {

    //create sample of database
    List<Clothes> clothes = new ArrayList<>(Arrays.asList(
            new Clothes(1, "T-shirt", 1, List.of("Spring", "Summer", "Fall", "Winter")),
            new Clothes(2, "Shorts", 1, List.of("Spring", "Summer")),
            new Clothes(3, "Shirt", 2, List.of("Spring", "Summer", "Fall", "Winter")),
            new Clothes(4, "Skirt", 1, List.of("Spring", "Summer"))
    ));


    public List<Clothes> getAllClothes() {
        return clothes;
    }
} //last
