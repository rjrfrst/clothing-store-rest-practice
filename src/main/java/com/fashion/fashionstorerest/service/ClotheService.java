package com.fashion.fashionstorerest.service;

import com.fashion.fashionstorerest.model.Clothes;
import com.fashion.fashionstorerest.repository.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClotheService {

    //inside the Service
    //I have to get the data which lives inside the repository
    @Autowired
    private ClotheRepository clotheRepository;

    //get all clothes
    public List<Clothes> getAllClothes(){
        return clotheRepository.getAllClothes();
    }

    //get single clothing
    public Clothes getSinglePieceOfClothing(long id){
        return clotheRepository.getSinglePieceOfClothing(id);
    }

} //last
