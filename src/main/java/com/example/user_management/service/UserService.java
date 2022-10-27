package com.example.user_management.service;

import com.example.user_management.dto.UserRegistrationDTO;
import com.example.user_management.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDTO registrationDTO);

}
