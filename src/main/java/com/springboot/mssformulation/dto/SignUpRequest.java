package com.springboot.mssformulation.dto;

import com.springboot.mssformulation.models.Role;

import lombok.Data;

@Data
public class SignUpRequest {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private boolean isActive;
    private Role role;
}
