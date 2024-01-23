package com.springboot.mssformulation.controllers;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.mssformulation.dto.SignUpRequest;
import com.springboot.mssformulation.models.User;
import com.springboot.mssformulation.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<Page<User>> getUsers(@PageableDefault Pageable pageable) {
        return userService.getUsers(pageable);
    }

    @GetMapping("{id}")
    public User getUserDetails(@PathVariable("id") Integer id) {
        return userService.getUserDetails(id);
    }

    @PostMapping
    public String createUser(@RequestBody SignUpRequest signUpRequest) {
        userService.createUser(signUpRequest);
        return "User Created Successfully";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        userService.updateUser(user);
        return "User Updated Successfully";
    }

    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return "User Deleted Successfully";
    }

}
