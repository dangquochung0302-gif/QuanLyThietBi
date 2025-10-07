package com.example.quanlithietbi.repository;

import com.example.quanlithietbi.entity.QuaTrinhThiNghiem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QuaTrinhThiNghiemRepository extends JpaRepository<QuaTrinhThiNghiem, UUID> {
}
