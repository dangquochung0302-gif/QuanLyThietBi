package com.example.quanlithietbi.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "\"QuaTrinhThiNghiem\"", schema = "dbo")
public class QuaTrinhThiNghiem {

    @Id
    @NotNull
    @Column(name = "Id", nullable = false, columnDefinition = "uniqueidentifier")
    private UUID id;

    @NotNull
    @Column(name = "NgayThiNghiem", nullable = false)
    private LocalDate ngayThiNghiem;

    @Size(max = 256)
    @NotNull
    @Nationalized
    @Column(name = "NoiDungThiNghiem", nullable = false, length = 256)
    private String noiDungThiNghiem;

    @NotNull
    @Column(name = "KetQua", nullable = false)
    private Boolean ketQua = false;

    @Size(max = 16)
    @NotNull
    @Nationalized
    @Column(name = "ASSETID", nullable = false, length = 16)
    private String assetid;
}
