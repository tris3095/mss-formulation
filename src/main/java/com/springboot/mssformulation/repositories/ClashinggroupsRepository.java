package com.springboot.mssformulation.repositories;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mssformulation.models.Clashinggroups;

@Repository
public interface ClashinggroupsRepository extends JpaRepository<Clashinggroups, Integer> {
    Page<Clashinggroups> findAll(Pageable pageable);
}
