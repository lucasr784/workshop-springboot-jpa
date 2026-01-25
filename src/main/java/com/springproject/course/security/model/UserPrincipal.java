package com.springproject.course.security.model;

import java.util.List;

import lombok.Builder;

@Builder
public record UserPrincipal(Long userId, String email, List<String> roles) {

}
