package com.example.HotelService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="hotel")
public class HotelModel {
    @Id
    private int id;
    private String name;
    private String location;
}
