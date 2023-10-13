package com.example.UserService.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingModel {

    private int ratingId;
    private int rating;
    private int hotelId;
    private int userId;
    private String feedback;
}
