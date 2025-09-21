package com.habitTrackerApp.habitTrackerApp.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import io.jsonwebtoken.*;

import java.time.LocalDateTime;
import java.util.Date;

@Component
public class JwtCore {

    @Value("${testing.app.secret}")
    private String secret;

    @Value("${testing.app.expiration}")
    private int expiration;

    public String generateToken(Authentication authentication){
            UserDetailsImpl userDetailsimpl = (UserDetailsImpl)authentication.getPrincipal();
            return Jwts.builder()
                    .setSubject(userDetailsimpl.getUsername()).issuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + expiration))
                    .signWith(SignatureAlgorithm.HS256, secret)
                    .compact();
    }
}
