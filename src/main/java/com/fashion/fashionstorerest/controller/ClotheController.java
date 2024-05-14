package com.fashion.fashionstorerest.controller;

import com.fashion.fashionstorerest.model.Clothes;
import com.fashion.fashionstorerest.service.ClotheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public Clothes getSingleCloth(@PathVariable("id") long id){
        return clotheService.getSinglePieceOfClothing(id);
    }


} //last
