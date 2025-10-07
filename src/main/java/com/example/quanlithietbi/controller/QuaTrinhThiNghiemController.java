package com.example.quanlithietbi.controller;

import com.example.quanlithietbi.entity.QuaTrinhThiNghiem;
import com.example.quanlithietbi.service.QuaTrinhThiNghiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/qttn")
@CrossOrigin(origins = "*")
public class QuaTrinhThiNghiemController {

 @Autowired
 private QuaTrinhThiNghiemService service;

 // Lấy danh sách (có phân trang)
 @GetMapping
 public ResponseEntity<?> getAll(
         @RequestParam(defaultValue = "0") int page,
         @RequestParam(defaultValue = "10") int size) {

  Pageable pageable = PageRequest.of(page, size);
  Page<QuaTrinhThiNghiem> result = service.findAll(pageable);
  return ResponseEntity.ok(result);
 }

 // Lấy chi tiết 1 bản ghi theo ID
 @GetMapping("/{id}")
 public ResponseEntity<?> getById(@PathVariable UUID id) {
  Optional<QuaTrinhThiNghiem> item = service.find(id);
  if (item.isPresent()) {
   return ResponseEntity.ok(item.get());
  } else {
   return ResponseEntity.ok("{\"MESSAGE\":\"NODATA\",\"TYPE\":\"SUCCESS\"}");
  }
 }

 // Thêm mới bản ghi
 @PostMapping
 public ResponseEntity<?> create(@RequestBody QuaTrinhThiNghiem qttn) {
  if (qttn.getId() == null) {
   qttn.setId(UUID.randomUUID());
  }
  QuaTrinhThiNghiem saved = service.save(qttn);
  return ResponseEntity.ok(saved);
 }

 //  Cập nhật bản ghi
 @PutMapping("/{id}")
 public ResponseEntity<?> update(@PathVariable UUID id, @RequestBody QuaTrinhThiNghiem qttn) {
  Optional<QuaTrinhThiNghiem> existing = service.find(id);
  if (existing.isPresent()) {
   qttn.setId(id);
   QuaTrinhThiNghiem updated = service.save(qttn);
   return ResponseEntity.ok(updated);
  } else {
   return ResponseEntity.status(404).body("{\"MESSAGE\":\"NOT FOUND\"}");
  }
 }

 // Xóa bản ghi theo ID
 @DeleteMapping("/{id}")
 public ResponseEntity<?> delete(@PathVariable UUID id) {
  service.delete(id);
  return ResponseEntity.ok("{\"MESSAGE\":\"DELETED SUCCESSFULLY\"}");
 }

 // Đếm tổng số bản ghi
 @GetMapping("/count")
 public ResponseEntity<?> count() {
  long total = service.count();
  return ResponseEntity.ok(total);
 }
}
