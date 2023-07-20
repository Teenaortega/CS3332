package com.cs3332.fooddelivery.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class restaurant {
    @Id
    private String id;
    private String name;
    private String address;
    private String phoneNumber;
 
	// Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String setName(String newName) {
        this.name = newName;
        return name;
    }
    public String getAddress() {
        return address;
    }

	// Setters

    public String setAddress(String newAddress) {
        this.address = newAddress;
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        return phoneNumber;
    }

}