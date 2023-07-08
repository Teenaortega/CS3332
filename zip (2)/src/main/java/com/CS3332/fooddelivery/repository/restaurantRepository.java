package com.CS3332.fooddelivery.repository;

import com.CS3332.fooddelivery.data.restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface restaurantRepository extends MongoRepository<restaurant, Integer> {

}
