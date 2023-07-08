package com.CS3332.fooddelivery.restaurantController;

import  com.CS3332.fooddelivery.data.restaurant;
import com.CS3332.fooddelivery.service.restaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurants")

public class restaurantController {
    @Autowired
    private restaurantService restaurantService;

    @GetMapping
    public  List<restaurant> findAll(){
        return restaurantService.findAll();
    }

    @GetMapping("/{id}")
    public restaurant findById(@PathVariable int id){
        return restaurantService.findById(id);
    }

    @PostMapping
    public restaurant  create(@RequestBody restaurant restaurant){
        return restaurantService.save(restaurant);
    }

    @PutMapping("/{id}")
    public restaurant  update(@RequestBody restaurant restaurant ){
        return restaurantService.save(restaurant);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        restaurantService.deleteById(id);
    }

}
