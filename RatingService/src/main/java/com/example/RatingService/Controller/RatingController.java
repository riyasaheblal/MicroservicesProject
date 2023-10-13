package com.example.RatingService.Controller;

import com.example.RatingService.Model.RatingModel;
import com.example.RatingService.Service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @PostMapping("/create")
    public RatingModel create(@RequestBody RatingModel ratingModel){
        return  this.ratingService.createRate(ratingModel);
    }

    @GetMapping("/getAll")
    public List<RatingModel> get(){
        return this.ratingService.read();
    }

    @GetMapping("/getById/{ratingId}")
    public Optional<RatingModel> getById(@PathVariable int ratingId){
        return this.ratingService.readId(ratingId);
    }
    @GetMapping("/getByUserId/{userId}")
    public List<RatingModel> getByUserId(@PathVariable int userId){
        return this.ratingService.getByUserId(userId);
    }

    @PutMapping("/update/{ratingId}")
    public RatingModel update(@RequestBody RatingModel ratingModel,@PathVariable int id){
        return this.ratingService.update(ratingModel,id);
    }

    @DeleteMapping("/delete/{ratingId}")
    public void delete(@PathVariable int id)
    {
        this.ratingService.delete(id);
    }
}
