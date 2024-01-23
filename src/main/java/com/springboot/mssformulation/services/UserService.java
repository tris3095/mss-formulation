package com.springboot.mssformulation.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.springboot.mssformulation.dto.SignUpRequest;
import com.springboot.mssformulation.models.User;

public interface UserService {
    UserDetailsService userDetailsService();

    ResponseEntity<Page<User>> getUsers(Pageable pageable);

    User getUserDetails(Integer id);

    String createUser(SignUpRequest signUpRequest);

    String updateUser(User user);

    String deleteUser(Integer id);

}
