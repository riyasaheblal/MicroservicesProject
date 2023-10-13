package com.example.RatingService.Service;

import com.example.RatingService.Model.RatingModel;
import com.example.RatingService.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingServiceImpl implements  RatingService{
    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public RatingModel createRate(RatingModel ratingModel) {
        return this.ratingRepository.save(ratingModel);
    }

    @Override
    public List<RatingModel> read() {
        return this.ratingRepository.findAll();
    }

    @Override
    public Optional<RatingModel> readId(int id) {
        return this.ratingRepository.findById(id);
    }

    @Override
    public RatingModel update(RatingModel ratingModel, int id) {
        ratingModel.setRatingId(id);
        return this.ratingRepository.save(ratingModel);
    }

    @Override
    public void delete(int id) {
     this.ratingRepository.deleteById(id);
    }

    @Override
    public List<RatingModel> getByUserId(int userId) {
        return this.ratingRepository.findByUserId(userId);
    }
}
