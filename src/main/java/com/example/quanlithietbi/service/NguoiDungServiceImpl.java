package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.NguoiDung;
import com.example.quanlithietbi.repository.NguoiDungRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NguoiDungServiceImpl implements NguoiDungService {

    private final NguoiDungRepository repository;

    @Override
    public Page<NguoiDung> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<NguoiDung> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<NguoiDung> findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public NguoiDung save(NguoiDung user) {
        return repository.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
