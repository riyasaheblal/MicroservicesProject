package com.example.RatingService.Service;

import com.example.RatingService.Model.RatingModel;

import java.util.List;
import java.util.Optional;

public interface RatingService {

    //create
    RatingModel createRate(RatingModel ratingModel);
    //read
    List<RatingModel> read();
    //readid
    Optional<RatingModel> readId(int id);
    //updatebyid
    RatingModel update(RatingModel ratingModel, int id);
    //deleteid
    void delete(int id);

    List<RatingModel> getByUserId(int userId);

}
