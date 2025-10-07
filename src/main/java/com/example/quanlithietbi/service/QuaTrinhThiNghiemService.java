package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.QuaTrinhThiNghiem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface QuaTrinhThiNghiemService {

    QuaTrinhThiNghiem save(QuaTrinhThiNghiem qttn);

    Optional<QuaTrinhThiNghiem> find(UUID id);

    List<QuaTrinhThiNghiem> findAll();

    Page<QuaTrinhThiNghiem> findAll(Pageable pageable);

    void delete(UUID id);

    long count();
}
