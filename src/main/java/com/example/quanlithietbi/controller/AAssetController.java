package com.example.quanlithietbi.controller;

import com.example.quanlithietbi.entity.AAsset;
import com.example.quanlithietbi.service.AAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/aasset")
@CrossOrigin(origins = "*")
public class AAssetController {

 @Autowired
 private AAssetService aAssetService;

 // Lấy danh sách tài sản (có phân trang + sắp xếp)
 @GetMapping
 public ResponseEntity<?> getAllAAsset(
         @RequestParam(defaultValue = "0") int page,
         @RequestParam(defaultValue = "20") int size,
         @RequestParam(defaultValue = "assetid") String sortBy,
         @RequestParam(defaultValue = "asc") String sortDir) {

  Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending()
          : Sort.by(sortBy).descending();

  Pageable pageable = PageRequest.of(page, size, sort);
  Page<AAsset> assets = aAssetService.findAll(pageable);

  return ResponseEntity.ok(assets);
 }

 // Lấy chi tiết 1 tài sản theo ID
 @GetMapping("/{id}")
 public ResponseEntity<?> getAssetById(@PathVariable String id) {
  Optional<AAsset> asset = aAssetService.find(id);
  if (asset.isPresent()) {
   return ResponseEntity.ok(asset.get());
  } else {
   return ResponseEntity.ok().body("{\"MESSAGE\":\"NODATA\",\"TYPE\":\"SUCCESS\"}");
  }
 }

 // Thêm mới tài sản
 @PostMapping
 public ResponseEntity<?> createAsset(@RequestBody AAsset aAsset) {
  AAsset saved = aAssetService.save(aAsset);
  return ResponseEntity.ok(saved);
 }

 // Cập nhật tài sản
 @PutMapping("/{id}")
 public ResponseEntity<?> updateAsset(@PathVariable String id, @RequestBody AAsset aAsset) {
  Optional<AAsset> existing = aAssetService.find(id);
  if (existing.isPresent()) {
   aAsset.setAssetid(id); // Giữ nguyên ID cũ
   AAsset updated = aAssetService.save(aAsset);
   return ResponseEntity.ok(updated);
  } else {
   return ResponseEntity.status(404).body("{\"MESSAGE\":\"NOT FOUND\"}");
  }
 }

 // Xóa tài sản theo ID
 @DeleteMapping("/{id}")
 public ResponseEntity<?> deleteAsset(@PathVariable String id) {
  aAssetService.delete(id);
  return ResponseEntity.ok("{\"MESSAGE\":\"DELETED SUCCESSFULLY\"}");
 }

 // Đếm tổng số bản ghi
 @GetMapping("/count")
 public ResponseEntity<?> countAssets() {
  long count = aAssetService.count();
  return ResponseEntity.ok(count);
 }

}
