package com.habitTrackerApp.habitTrackerApp.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;

@Component
public class JwtCore {

    @Value("${testing.app.secret}")
    private String token;

    @Value("${testing.app.expiration}")
    private int lifetime;

//    public String generateToken(Authentication authentication){
//
//    }
}
