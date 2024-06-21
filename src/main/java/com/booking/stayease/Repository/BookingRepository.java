package com.booking.stayease.Repository;

import com.booking.stayease.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>{
    
}
