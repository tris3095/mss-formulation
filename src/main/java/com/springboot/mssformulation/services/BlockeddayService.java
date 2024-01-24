package com.springboot.mssformulation.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.springboot.mssformulation.models.Blockedday;

public interface BlockeddayService {
    ResponseEntity<Page<Blockedday>> getAll(Pageable pageable);

    Blockedday getDetails(Integer id);

    String create(Blockedday blockedday);

    String update(Blockedday blockedday);

    String delete(Integer id);
}
