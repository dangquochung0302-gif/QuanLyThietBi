package com.example.quanlithietbi.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "NguoiDung", schema = "dbo")
public class NguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID", nullable = false)
    private Integer userId;

    @Nationalized
    @Column(name = "HoTen", length = 100)
    private String hoTen;

    @Column(name = "Email", length = 100)
    private String email;

    @Column(name = "SoDienThoai", length = 20)
    private String soDienThoai;

    @Nationalized
    @Column(name = "VaiTro", length = 50)
    private String vaiTro;

    @Column(name = "MatKhau", length = 100)
    private String matKhau;

    @Column(name = "NgayTao")
    private LocalDateTime ngayTao;
}
