package com.fashion.fashionstorerest.service;

import com.fashion.fashionstorerest.model.Store;
import com.fashion.fashionstorerest.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {

    //I want to display all the stores
    //display a singular store
    //get a specific clothing inside a store
    //delete a store

    @Autowired
    private StoreRepository storeRepository;

    //Get all stores available right now
    public List<Store> getAllStores(){
        return storeRepository.findAll();
    }

    //get a store
    public Store getSingularStore(long id){
        return storeRepository.findById(id).orElse(new Store());
    }

    //delete a store
    public void deleteStore(long id){
        storeRepository.deleteById(id);
    }

} //last
