package com.CS3332.fooddelivery.data;

import org.springframework.data.annotation.Id;

public class restaurant {
    @Id
    private int id;
    private String name;
    private String address;
    private int phoneNumber;

    public int getId() {
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
    public String setAddress(String newAddress) {
        this.address = newAddress;
        return address;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = Integer.parseInt(newPhoneNumber);
        return phoneNumber;
    }

}
