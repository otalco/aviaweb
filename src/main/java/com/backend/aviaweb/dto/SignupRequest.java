package com.backend.aviaweb.dto;

import lombok.Data;

import java.util.Set;

@Data
public class SignupRequest {
    private String nome;
    private String email;
    private String senha;
    private Set<String> roles;
}
