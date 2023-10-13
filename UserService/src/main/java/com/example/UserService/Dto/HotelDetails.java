package com.example.UserService.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HotelDetails {
    private int hotelId;
    private String name;
    private String location;
    private int rating;
    private String feedback;
}