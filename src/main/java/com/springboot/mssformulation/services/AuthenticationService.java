package com.springboot.mssformulation.services;

import com.springboot.mssformulation.dto.RefreshTokenRequest;
import com.springboot.mssformulation.dto.SignInRequest;
import com.springboot.mssformulation.dto.SignUpRequest;
import com.springboot.mssformulation.models.User;
import com.springboot.mssformulation.services.impl.JwtAuthenticationResponse;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
