package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.SOrganization;
import com.example.quanlithietbi.repository.SOrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SOrganizationServiceImpl implements SOrganizationService {

    private final SOrganizationRepository repository;

    @Override
    public Page<SOrganization> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Optional<SOrganization> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Optional<SOrganization> findByOrgid(String orgid) {
        return repository.findByOrgid(orgid);
    }

    @Override
    public SOrganization save(SOrganization organization) {
        return repository.save(organization);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }
}
