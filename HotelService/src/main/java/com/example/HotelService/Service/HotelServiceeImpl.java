package com.example.HotelService.Service;

import com.example.HotelService.Model.HotelModel;
import com.example.HotelService.Repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceeImpl implements HotelServicee {

@Autowired
private HotelRepository hotelRepository;

    @Override
    public HotelModel create(HotelModel hotelmodel) {
        return this.hotelRepository.save(hotelmodel);
    }

    @Override
    public List<HotelModel> getAllHotel() {
        return this.hotelRepository.findAll();
    }

    @Override
    public Optional<HotelModel> readById(int id) {
        return this.hotelRepository.findById(id);
    }

    @Override
    public HotelModel updateById(int id, HotelModel hotelmodel) {
        hotelmodel.setId(id);
        return this.hotelRepository.save(hotelmodel);
    }

    @Override
    public void DeleteById(int id) {
        this.hotelRepository.deleteById(id);
    }
}
