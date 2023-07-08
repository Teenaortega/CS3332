package com.CS3332.fooddelivery.service;

import com.CS3332.fooddelivery.data.restaurant;
import com.CS3332.fooddelivery.exception.EntityNotFoundException;
import com.CS3332.fooddelivery.repository.restaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class restaurantService {
    @Autowired
    private restaurantRepository restaurantRepository;

    public List<restaurant> findAll() {
        return restaurantRepository.findAll();
    }

    public  restaurant findById(int id){
        return restaurantRepository.findById(id).orElseThrow(EntityNotFoundException:: new);
    }
    public restaurant save(restaurant restaurant){
        return restaurantRepository.save(restaurant);
    }
    public void deleteById (int id){
        restaurantRepository.deleteById(id);
    }
}
