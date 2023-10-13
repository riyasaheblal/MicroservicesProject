package com.example.UserService.Controller;

import com.example.UserService.Dto.UserDetails;
import com.example.UserService.Model.UserModel;
import com.example.UserService.Service.UserService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public UserModel create(@RequestBody UserModel userModel){
        return  this.userService.create(userModel);
    }

    @GetMapping("/getuser")
    public List<UserModel> get(){
        return this.userService.read();
    }

    @GetMapping("/getuser/{id}")
    public Optional<UserModel> getid(@PathVariable int id){
        return this.userService.readid(id);
    }

    @GetMapping("/getUserHotels/{id}")
    //@CircuitBreaker(name = "ratingHotelBreaker", fallbackMethod = "ratHotelFallBack")
    @RateLimiter(name = "userRateLimiter", fallbackMethod = "ratHotelFallBack")
    public UserDetails getUserRatedHotelsById(@PathVariable int id){
        return this.userService.getUserDetailsById(id);
    }

    public UserDetails ratHotelFallBack(int userId, Exception ex){
        return UserDetails.builder()
                .userId(userId)
                .email("dummyUser@test.com")
                .name("dummy name")
                .hotelDetailsList(null)
                .about("This is dummy userDetails created because there is some error on other microservices")
                .build();
    }

    @PutMapping("/update/{id}")
    public UserModel update(@RequestBody UserModel userModel,@PathVariable int id){
        return this.userService.updateId(userModel,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.userService.deleteId(id);
    }
}
