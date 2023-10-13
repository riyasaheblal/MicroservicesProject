package com.example.UserService.Mapper;

import com.example.UserService.Dto.HotelDetails;
import com.example.UserService.Dto.UserDetails;
import com.example.UserService.Model.HotelModel;
import com.example.UserService.Model.RatingModel;
import com.example.UserService.Model.UserModel;

public class HotelUserRatingMapper {

    public static HotelDetails mapRatingModelAndHotel(RatingModel ratingModel, HotelModel hotelModel){
        return HotelDetails.builder()
                .hotelId(ratingModel.getHotelId())
                .rating(ratingModel.getRating())
                .feedback(ratingModel.getFeedback())
                .location(hotelModel.getLocation())
                .name(hotelModel.getName())
                .build();
    }

}
