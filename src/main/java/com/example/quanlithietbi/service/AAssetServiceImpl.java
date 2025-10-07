package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.AAsset;
import com.example.quanlithietbi.repository.AAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@Service
public class AAssetServiceImpl implements AAssetService {

    @Autowired
    private AAssetRepository aassetRepository;

    @Override
    public AAsset save(AAsset aasset) {
        return aassetRepository.save(aasset);
    }

    @Override
    public Optional<AAsset> find(String id) {
        return aassetRepository.findById(id);
    }

    @Override
    public List<AAsset> findAll() {
        return aassetRepository.findAll();
    }

    @Override
    public List<AAsset> findAll(Sort sort){
        return aassetRepository.findAll(sort);
    }

    @Override
    public Page<AAsset> findAll(Pageable pageable){
        return aassetRepository.findAll(pageable);
    }

    @Override
    public void delete(String id) {
    aassetRepository.deleteById(id);
    }

    @Override
    public void delete(AAsset aasset) {
        aassetRepository.delete(aasset);
    }

    @Override
    public void deleteAll() {
        aassetRepository.deleteAll();
    }

    @Override
    public long count() {
        return aassetRepository.count();
    }

}