package com.backend.aviaweb.service;

import com.backend.aviaweb.dto.SignupRequest;
import com.backend.aviaweb.model.User;
import com.backend.aviaweb.repository.RoleRepository;
import com.backend.aviaweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;  

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void register(SignupRequest signupRequest){
        if (userRepository.existsByEmail(signupRequest.getEmail())) {
            throw new RuntimeException("Erro: Email já está em uso!");
        }
        User user = new User();
        user.setName(signupRequest.getNome());
    }

}
