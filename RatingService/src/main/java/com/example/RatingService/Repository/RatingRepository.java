package com.example.RatingService.Repository;

import com.example.RatingService.Model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends JpaRepository<RatingModel, Integer> {

    List<RatingModel> findByUserId(int userId);

}
