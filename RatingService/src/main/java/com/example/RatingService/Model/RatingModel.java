package com.example.RatingService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="hotelrating")
@Data
public class RatingModel {

    @Id
    private int ratingId;
    private int rating;
    private int hotelId;
    private int userId;
    private String feedback;
}
