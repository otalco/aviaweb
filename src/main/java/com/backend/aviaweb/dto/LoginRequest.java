package com.backend.aviaweb.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
