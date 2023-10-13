package com.example.HotelService.Service;

import com.example.HotelService.Model.HotelModel;

import java.util.List;
import java.util.Optional;

public interface HotelServicee {

    //create
    HotelModel create(HotelModel hotelModel);
   //read
    List<HotelModel> getAllHotel();
    //readbyid
    Optional<HotelModel> readById(int id);
    //updatebyid
    HotelModel updateById(int id, HotelModel hotelModel);
    //deleteById
    void DeleteById(int id);
}
