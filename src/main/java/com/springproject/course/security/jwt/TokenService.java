package com.springproject.course.security.jwt;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.springproject.course.domain.entities.User;
import com.springproject.course.security.model.UserPrincipal;

@Component
public class TokenService {

    private String secret = "secret";

    public String generateToken(User user) {

        Algorithm algorithm = Algorithm.HMAC256(secret);

        List<String> roles = user.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .toList();

        return JWT.create()
                .withClaim("userId", user.getId())
                .withClaim("roles", roles)
                .withSubject(user.getEmail())
                .withExpiresAt(Instant.now().plusSeconds(86400))
                .withIssuedAt(Instant.now())
                .sign(algorithm);
    }

    public Optional<UserPrincipal> validateToken(String token) {

        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            DecodedJWT decode = JWT.require(algorithm)
                    .build().verify(token);

            return Optional.of(UserPrincipal.builder()
                    .userId(decode.getClaim("userId").asLong())
                    .email(decode.getSubject())
                    .roles(decode.getClaim("roles").asList(String.class))
                    .build());

        } catch (JWTVerificationException ex) {
            return Optional.empty();
        }

    }

}
