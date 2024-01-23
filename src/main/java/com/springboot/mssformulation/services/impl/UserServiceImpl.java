package com.springboot.mssformulation.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.mssformulation.dto.SignUpRequest;
import com.springboot.mssformulation.models.Role;
import com.springboot.mssformulation.models.User;
import com.springboot.mssformulation.repositories.UserRepository;
import com.springboot.mssformulation.services.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    // private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetailsService userDetailsService() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) {
                return userRepository.findByUsername(username)
                        .orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
            }
        };
    }

    @Override
    public ResponseEntity<Page<User>> getUsers(Pageable pageable) {
        return new ResponseEntity<>(userRepository.findAll(pageable), HttpStatus.OK);
    }

    @Override
    public User getUserDetails(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public String createUser(SignUpRequest signUpRequest) {
        User user = new User();

        user.setFirstName(signUpRequest.getFirstName());
        user.setLastName(signUpRequest.getLastName());
        user.setUsername(signUpRequest.getUsername());
        user.setRole(Role.USER);
        // user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        user.setPassword(signUpRequest.getPassword());
        user.setActive(true);

        userRepository.save(user);
        return "Success";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String deleteUser(Integer id) {
        userRepository.deleteById(id);
        return "Success";
    }
}
