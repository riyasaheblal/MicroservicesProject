package com.example.UserService.Service;

import com.example.UserService.Dto.UserDetails;
import com.example.UserService.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //create
    UserModel create(UserModel userModel);
    //read
    List<UserModel> read();
    //readid
    Optional<UserModel> readid(int id);
    //upodateid
    UserModel updateId(UserModel userModel,int id);
    //deleteid
    void deleteId(int id);
    UserDetails getUserDetailsById(int id);
}
