package com.example.UserService.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDetails {
    private int userId;
    private String name;
    private String email;
    private String about;
    private List<HotelDetails> hotelDetailsList;
}
