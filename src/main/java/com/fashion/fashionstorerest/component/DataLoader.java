package com.fashion.fashionstorerest.component;

import com.fashion.fashionstorerest.model.Clothes;
import com.fashion.fashionstorerest.repository.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    //move the data we want and save it here

    @Autowired
    ClotheRepository clotheRepository;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception{

        //insert a piece of clothing
        //save them afterward.

        Clothes clothes1 = new Clothes(1, "T-shirt", 1, Arrays.asList("Spring ", "Summer "));
        Clothes clothes2 = new Clothes(2, "Shirt", 2, Arrays.asList("Spring ", "Summer ", "Fall ", "Winter "));
        Clothes clothes3 = new Clothes(3, "Shorts", 1, Arrays.asList("Spring ", "Summer "));
        Clothes clothes4 = new Clothes(4, "Skirt", 1, Arrays.asList("Spring ", "Summer "));

        clotheRepository.save(clothes1);
        clotheRepository.save(clothes2);
        clotheRepository.save(clothes3);
        clotheRepository.save(clothes4);

    }


} //last

//List<Clothes> clothes = new ArrayList<>(Arrays.asList(
//        new Clothes(1, "T-shirt", 1, List.of("Spring", "Summer", "Fall", "Winter")),
//        new Clothes(2, "Shorts", 1, List.of("Spring", "Summer")),
//        new Clothes(3, "Shirt", 2, List.of("Spring", "Summer", "Fall", "Winter")),
//        new Clothes(4, "Skirt", 1, List.of("Spring", "Summer"))
//));