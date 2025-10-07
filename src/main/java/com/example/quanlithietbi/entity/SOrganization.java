package com.example.quanlithietbi.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "\"S_ORGANIZATION\"", schema = "dbo")
public class SOrganization {

    @Id
    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGID", nullable = false, length = 255)
    private String orgid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGDESC")
    private String orgdesc;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGCODE")
    private String orgcode;

    @Column(name = "ACTIVE")
    private Boolean active;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGID_PARENT")
    private String orgidParent;

    @Column(name = "ORGORD")
    private String orgord;

    @Column(name = "ORLEVEL")
    private String orlevel;

    @Size(max = 255)
    @Nationalized
    @Column(name = "COORDINATE")
    private String coordinate;

    @Column(name = "ISPM")
    private Boolean ispm;

    @Column(name = "ISOP")
    private Boolean isop;

    @Column(name = "ISLAB")
    private Boolean islab;

    @Column(name = "ISCD")
    private Boolean iscd;

    @Column(name = "ISQLTS")
    private Boolean isqlts;

    @Column(name = "ORGORD_NEW")
    private String orgordNew;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORG_ALIAS")
    private String orgAlias;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGSDP")
    private String orgsdp;
}
