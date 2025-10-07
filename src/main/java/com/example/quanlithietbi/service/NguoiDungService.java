package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.NguoiDung;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface NguoiDungService {
    Page<NguoiDung> findAll(Pageable pageable);
    Optional<NguoiDung> findById(Integer id);
    Optional<NguoiDung> findByEmail(String email);
    NguoiDung save(NguoiDung user);
    void deleteById(Integer id);
    long count();
}
