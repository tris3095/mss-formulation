package com.springboot.mssformulation.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mssformulation.models.Blockedot;

@Repository
public interface BlockedotRepository extends JpaRepository<Blockedot, Integer> {
    Page<Blockedot> findAll(Pageable pageable);
}
