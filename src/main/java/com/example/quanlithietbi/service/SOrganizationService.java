package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.SOrganization;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface SOrganizationService {

    Page<SOrganization> findAll(Pageable pageable);

    Optional<SOrganization> findById(String id);

    Optional<SOrganization> findByOrgid(String orgid);

    SOrganization save(SOrganization organization);

    void deleteById(String id);

    long count();
}
