package com.example.quanlithietbi.controller;

import com.example.quanlithietbi.entity.SOrganization;
import com.example.quanlithietbi.service.SOrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/org")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SOrganizationController {

    private final SOrganizationService service;

    // Lấy danh sách tất cả
    @GetMapping
    public ResponseEntity<Page<SOrganization>> getAll(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        return ResponseEntity.ok(service.findAll(PageRequest.of(page, size)));
    }

    // Lấy chi tiết  theo ORGID
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        Optional<SOrganization> data = service.findById(id);
        return data.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    //  Tìm kiếm theo mã đơn vị (query custom)
    @GetMapping("/search/{orgid}")
    public ResponseEntity<?> getByOrgid(@PathVariable String orgid) {
        Optional<SOrganization> data = service.findByOrgid(orgid);
        return data.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Thêm mới tổ chức
    @PostMapping
    public ResponseEntity<SOrganization> create(@RequestBody SOrganization org) {
        return ResponseEntity.ok(service.save(org));
    }

    //  Cập nhật theo ID
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody SOrganization org) {
        if (!service.findById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        org.setOrgid(id);
        return ResponseEntity.ok(service.save(org));
    }

    //  Xóa  theo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        service.deleteById(id);
        return ResponseEntity.ok("Deleted successfully");
    }

    //  Đếm tổng số
    @GetMapping("/count")
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(service.count());
    }
}
