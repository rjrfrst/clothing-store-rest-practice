package com.fashion.fashionstorerest.service;

import com.fashion.fashionstorerest.model.Clothes;
import com.fashion.fashionstorerest.repository.ClotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClotheService {

    //inside the Service
    //I have to get the data which lives inside the repository
    @Autowired
    private ClotheRepository clotheRepository;

    //get all clothes
    public List<Clothes> getAllClothes(){
        return clotheRepository.findAll();
    }

    //get single clothing
    public Clothes getSinglePieceOfClothing(long id){
        return clotheRepository.findById(id).orElse(new Clothes());
    }

    //add a piece of clothing
    public void addClothing(Clothes clothes){
        clotheRepository.save(clothes);
    }

    //update piece of clothing
    public void updateClothing(Clothes clothes){
        clotheRepository.save(clothes);
    }

    //delete a piece of clothing
    public void deleteClothes(long id) {
        clotheRepository.deleteById(id);
    }

    //get a specific piece of clothing inside a store
//    public Optional<Clothes> getSpecificClothingFromAStore(Long storeId, Long clothesId){
////        return clotheRepository.findByIdandStoreId(storeId, clothesId);
//    }

} //last
