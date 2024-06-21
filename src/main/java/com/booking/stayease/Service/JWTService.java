package com.booking.stayease.Service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashMap;

public interface JWTService {

    String extractUsername(String token);

    String generateToken(UserDetails userDetails);

    public boolean isTokenValis(String token, UserDetails userDetails);

    public String generateRefreshToken(HashMap<String, Object> claims, UserDetails userDetails);

}
