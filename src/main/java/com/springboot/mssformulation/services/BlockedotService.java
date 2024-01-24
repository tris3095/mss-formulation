package com.springboot.mssformulation.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.springboot.mssformulation.models.Blockedot;

public interface BlockedotService {
    ResponseEntity<Page<Blockedot>> getAll(Pageable pageable);

    Blockedot getDetails(Integer id);

    String create(Blockedot blockedot);

    String update(Blockedot blockedot);

    String delete(Integer id);
}
