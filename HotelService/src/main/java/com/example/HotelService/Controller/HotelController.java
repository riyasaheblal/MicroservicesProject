package com.example.HotelService.Controller;

import com.example.HotelService.Model.HotelModel;
import com.example.HotelService.Service.HotelServicee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelServicee hotelServicee;

    @PostMapping("/create")
    public HotelModel create(@RequestBody HotelModel hotelModel){
        return this.hotelServicee.create(hotelModel);
    }

    @GetMapping("/getAll")
    public List<HotelModel> getAll(){
        return  this.hotelServicee.getAllHotel();
    }

    @GetMapping("/getById/{id}")
    public Optional<HotelModel> getId(@PathVariable int id){
        return  this.hotelServicee.readById(id);
    }

    @PutMapping("/update/{id}")
    public HotelModel update(@RequestBody HotelModel hotelModel,@PathVariable int id){
        return this.hotelServicee.updateById(id, hotelModel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        this.hotelServicee.DeleteById(id);
    }
}
