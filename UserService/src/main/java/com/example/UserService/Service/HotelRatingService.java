package com.example.UserService.Service;

import com.example.UserService.Model.RatingModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@FeignClient(name = "RATING-SERVICE")
public interface HotelRatingService {

    @GetMapping("/rating/getByUserId/{userId}")
    List<RatingModel> getRatingByUserId(@PathVariable int userId);

}
