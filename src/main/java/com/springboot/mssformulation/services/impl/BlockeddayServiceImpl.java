package com.springboot.mssformulation.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.mssformulation.models.Blockedday;
import com.springboot.mssformulation.repositories.BlockeddayRepository;
import com.springboot.mssformulation.services.BlockeddayService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlockeddayServiceImpl implements BlockeddayService {
    private final BlockeddayRepository blockeddayRepository;

    @Override
    public ResponseEntity<Page<Blockedday>> getAll(Pageable pageable) {
        return new ResponseEntity<>(blockeddayRepository.findAll(pageable),
                HttpStatus.OK);
    }

    @Override
    public Blockedday getDetails(Integer id) {
        return blockeddayRepository.findById(id).get();
    }

    @Override
    public String create(Blockedday blockedday) {
        blockeddayRepository.save(blockedday);
        return "Success";
    }

    @Override
    public String update(Blockedday blockedday) {
        blockeddayRepository.save(blockedday);
        return "Success";
    }

    @Override
    public String delete(Integer id) {
        blockeddayRepository.deleteById(id);
        return "Success";
    }
}
