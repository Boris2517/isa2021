package com.example.isa2021.Entity;

import java.util.ArrayList;
import java.util.List;

public class House {

    private String name;
    private String address;
    private String description;
    private Integer numberOfRooms;
    private Integer numberOfBeds;
    //pictures of house
    private List<Promotion> promotions;
    private Owner owner;
    private List<Reservation> reservationList = new ArrayList<>();
    private Float price;

}
