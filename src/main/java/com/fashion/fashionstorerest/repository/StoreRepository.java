package com.fashion.fashionstorerest.repository;

import com.fashion.fashionstorerest.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {

} //last
