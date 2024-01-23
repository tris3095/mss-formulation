package com.springboot.mssformulation.repositories;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mssformulation.models.Role;
import com.springboot.mssformulation.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    User findByRole(Role role);

    Page<User> findAll(Pageable pageable);
}
