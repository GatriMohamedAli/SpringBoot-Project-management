package com.springboot.jwtApp.payloads;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
