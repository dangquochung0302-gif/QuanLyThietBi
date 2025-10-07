package com.example.quanlithietbi.service;

import com.example.quanlithietbi.entity.AAsset;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface AAssetService {

    AAsset save(AAsset aasset);

    Optional<AAsset> find(String id);

    List<AAsset> findAll();

    List<AAsset> findAll(Sort sort);

    Page<AAsset> findAll(Pageable pageable);

    void delete(String id);

    void delete(AAsset aasset);

    void deleteAll();

    long count();

}