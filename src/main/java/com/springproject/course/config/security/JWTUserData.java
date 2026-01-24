package com.springproject.course.config.security;

import lombok.Builder;

@Builder
public record JWTUserData(Long userId, String email) {

}
