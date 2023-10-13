package com.example.UserService.Service;

import com.example.UserService.Dto.HotelDetails;
import com.example.UserService.Dto.UserDetails;
import com.example.UserService.Mapper.HotelUserRatingMapper;
import com.example.UserService.Model.HotelModel;
import com.example.UserService.Model.RatingModel;
import com.example.UserService.Model.UserModel;
import com.example.UserService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private HotelRatingService hotelRatingService;
    @Autowired
    private HotelInfoService hotelInfoService;
    @Override
    public UserModel create(UserModel userModel) {
        return this.userRepository.save(userModel);
    }

    @Override
    public List<UserModel> read() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<UserModel> readid(int id) {
        return this.userRepository.findById(id);
    }

    @Override
    public UserModel updateId(UserModel userModel, int id) {
        Optional<UserModel> userModel1=userRepository.findById(id);
        if(userModel1.isPresent()){

        }
        userModel.setId(id);
        return this.userRepository.save(userModel);
    }

    @Override
    public void deleteId(int id) {
        this.userRepository.deleteById(id);
    }

    @Override
    public UserDetails getUserDetailsById(int id) {
        UserDetails userDetails = new UserDetails();
        Optional<UserModel> userModel= this.userRepository.findById(id);
        List<RatingModel> ratingModels = hotelRatingService.getRatingByUserId(id);

        if(userModel!=null && ratingModels.size()>0){

            List<HotelDetails> hotelDetailsList = new ArrayList<>();

            for (RatingModel ratingModel: ratingModels) {
                HotelModel hotelModel = hotelInfoService.getHotelInfoById(ratingModel.getHotelId());
                hotelDetailsList.add(HotelUserRatingMapper.mapRatingModelAndHotel(ratingModel, hotelModel));
            }

            userDetails = UserDetails.builder()
                    .userId(userModel.get().getId())
                    .name(userModel.get().getName())
                    .about(userModel.get().getAbout())
                    .email(userModel.get().getEmail())
                    .hotelDetailsList(hotelDetailsList)
                    .build();
        }
        return userDetails;
    }
}
