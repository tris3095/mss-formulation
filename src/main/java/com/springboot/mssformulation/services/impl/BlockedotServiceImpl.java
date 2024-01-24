package com.springboot.mssformulation.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.mssformulation.models.Blockedot;
import com.springboot.mssformulation.repositories.BlockedotRepository;
import com.springboot.mssformulation.services.BlockedotService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlockedotServiceImpl implements BlockedotService {
    private final BlockedotRepository blockedotRepository;

    @Override
    public ResponseEntity<Page<Blockedot>> getAll(Pageable pageable) {
        return new ResponseEntity<>(blockedotRepository.findAll(pageable),
                HttpStatus.OK);
    }

    @Override
    public Blockedot getDetails(Integer id) {
        return blockedotRepository.findById(id).get();
    }

    @Override
    public String create(Blockedot blockedot) {
        blockedotRepository.save(blockedot);
        return "Success";
    }

    @Override
    public String update(Blockedot blockedot) {
        blockedotRepository.save(blockedot);
        return "Success";
    }

    @Override
    public String delete(Integer id) {
        blockedotRepository.deleteById(id);
        return "Success";
    }
}
