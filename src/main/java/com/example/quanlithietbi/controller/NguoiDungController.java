package com.example.quanlithietbi.controller;

import com.example.quanlithietbi.entity.NguoiDung;
import com.example.quanlithietbi.service.NguoiDungService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/nguoidung")
@RequiredArgsConstructor
@CrossOrigin("*")
public class NguoiDungController {

 private final NguoiDungService service;

 @GetMapping
 public ResponseEntity<Page<NguoiDung>> getAll(
         @RequestParam(defaultValue = "0") int page,
         @RequestParam(defaultValue = "10") int size
 ) {
  return ResponseEntity.ok(service.findAll(PageRequest.of(page, size)));
 }

 @GetMapping("/{id}")
 public ResponseEntity<?> getById(@PathVariable Integer id) {
  return service.findById(id)
          .map(ResponseEntity::ok)
          .orElseGet(() -> ResponseEntity.notFound().build());
 }

 @GetMapping("/email/{email}")
 public ResponseEntity<?> getByEmail(@PathVariable String email) {
  return service.findByEmail(email)
          .map(ResponseEntity::ok)
          .orElseGet(() -> ResponseEntity.notFound().build());
 }

 @PostMapping
 public ResponseEntity<NguoiDung> create(@RequestBody NguoiDung user) {
  user.setNgayTao(LocalDateTime.now());
  return ResponseEntity.ok(service.save(user));
 }

 @PutMapping("/{id}")
 public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody NguoiDung user) {
  if (!service.findById(id).isPresent()) {
   return ResponseEntity.notFound().build();
  }
  user.setUserId(id);
  return ResponseEntity.ok(service.save(user));
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<?> delete(@PathVariable Integer id) {
  service.deleteById(id);
  return ResponseEntity.ok("Deleted successfully");
 }

 @GetMapping("/count")
 public ResponseEntity<Long> count() {
  return ResponseEntity.ok(service.count());
 }
}
