package com.booking.stayease.Service;

import com.booking.stayease.Entity.Hotel;

import java.util.List;

public interface HotelService {

        public List<Hotel> getAllHotels();

        public Hotel createHotel(Hotel hotel);

        public Hotel updateHotel(Long hotelId, Hotel hotelDetails);

        public void deleteHotel(Long hotelId);
    
}
