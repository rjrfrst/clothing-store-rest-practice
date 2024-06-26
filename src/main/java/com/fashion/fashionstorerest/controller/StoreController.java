package com.fashion.fashionstorerest.controller;


import com.fashion.fashionstorerest.model.Store;
import com.fashion.fashionstorerest.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StoreController {

    //pass the service
    @Autowired
    private StoreService storeService;

    //I want to display all the stores
    //display a singular store
    //get a specific clothing inside a store
    //delete a store

    //find all stores!
    @GetMapping("stores")
    @ResponseBody
    public List<Store> findAllStores(){
        return storeService.getAllStores();
    }

    //find a single store
    @GetMapping("store/{id}")
    @ResponseBody
    public Store findSingleStore(@PathVariable long id){
        return storeService.getSingularStore(id);
    }

    //delete a store
    @DeleteMapping("store/{id}")
    @ResponseBody
    public String deleteStore(@PathVariable long id){
        storeService.deleteStore(id);
        return "store removed";
    }


} // last
