package com.example.UserService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Table(name="userdata")
@Data
public class UserModel {
    @Id
    private int Id;
    private String name;
    private String email;
    private String about;
}
