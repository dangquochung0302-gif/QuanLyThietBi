package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.QuaTrinhThiNghiem;
import com.example.quanlithietbi.repository.QuaTrinhThiNghiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class QuaTrinhThiNghiemServiceImpl implements QuaTrinhThiNghiemService {

    @Autowired
    private QuaTrinhThiNghiemRepository repository;

    @Override
    public QuaTrinhThiNghiem save(QuaTrinhThiNghiem qttn) {
        return repository.save(qttn);
    }

    @Override
    public Optional<QuaTrinhThiNghiem> find(UUID id) {
        return repository.findById(id);
    }

    @Override
    public List<QuaTrinhThiNghiem> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<QuaTrinhThiNghiem> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
