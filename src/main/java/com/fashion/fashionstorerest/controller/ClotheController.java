package com.fashion.fashionstorerest.controller;

import com.fashion.fashionstorerest.model.Clothes;
import com.fashion.fashionstorerest.service.ClotheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClotheController {

    //inside the controller
    //pass the service
    @Autowired
    private ClotheService clotheService;

    //I want to user the CRUD operations here (Get, Post, Put, Delete Mapping)

    //find all clothes
    @GetMapping("clothes")
    @ResponseBody //Whatever I am sending is a body (data)
    public List<Clothes> findAllClothes(){
        return clotheService.getAllClothes();
    }

    //find single clothing by its id
    @GetMapping("pieceOfClothing/{id}")
    @ResponseBody
    public Clothes getSingleCloth(@PathVariable long id){
        return clotheService.getSinglePieceOfClothing(id);
    }

    //add a piece of clothing
    @PostMapping("clothes")
    @ResponseBody
    public Clothes addClothes(@RequestBody Clothes clothes) {
        clotheService.addClothing(clothes);
        return clotheService.getSinglePieceOfClothing(clothes.getId());
    }

    //Change a piece of clothing
    //Put request
    @PutMapping("clothes")
    @ResponseBody
    public Clothes updateClothes(@RequestBody Clothes clothes){
        clotheService.updateClothing(clothes);
        return clotheService.getSinglePieceOfClothing(clothes.getId());
    }

    //delete a piece of clothing
    //I need to target their ID
    @DeleteMapping("clothes/{id}")
    @ResponseBody
    public String deletedClothing(@PathVariable long id){
        clotheService.deleteClothes(id);
        return "clothing removed";
    }

} //last
