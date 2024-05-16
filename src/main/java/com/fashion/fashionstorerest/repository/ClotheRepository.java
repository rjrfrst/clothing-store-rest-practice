package com.fashion.fashionstorerest.repository;

import com.fashion.fashionstorerest.model.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface ClotheRepository extends JpaRepository<Clothes, Long> {


} //last

//Reference
////create sample of database
//List<Clothes> clothes = new ArrayList<>(Arrays.asList(
//        new Clothes(1, "T-shirt", 1, List.of("Spring", "Summer", "Fall", "Winter")),
//        new Clothes(2, "Shorts", 1, List.of("Spring", "Summer")),
//        new Clothes(3, "Shirt", 2, List.of("Spring", "Summer", "Fall", "Winter")),
//        new Clothes(4, "Skirt", 1, List.of("Spring", "Summer"))
//));
//
////add clothes
//public void addClothes(Clothes newClothes){
//    clothes.add(newClothes);
//}
//
////all clothes
//public List<Clothes> getAllClothes() {
//    return clothes;
//}
//
////single cloth
//public Clothes getSinglePieceOfClothing(long id){
//    //I want to check all the data and if it match return that data
//    for(Clothes cloth : clothes)
//    {
//        if(cloth.getId() == id)
//            return cloth;
//    }
//    //if it doesn't match return nothing
//    return null;
//}
//
////update single clothing
//public void updateClothing(Clothes updatedClothes){
//    //find clothes
//    for(Clothes clothes1 : clothes){
//        //manually search for each clothing
//        if(clothes1.getId() == updatedClothes.getId()){
//            clothes1.setClothingType(updatedClothes.getClothingType());
//            clothes1.setSize(updatedClothes.getSize());
//            clothes1.setSeason(updatedClothes.getSeason());
//        }
//    }
//}
//
////delete clothing
//public void deleteClothes(long id) {
//    //check inside a loop if the id matches
//    for(Clothes clothes1 : clothes){
//        if (clothes1.getId() == id){
//            clothes.remove(clothes1);
//        }
//    }
//}
