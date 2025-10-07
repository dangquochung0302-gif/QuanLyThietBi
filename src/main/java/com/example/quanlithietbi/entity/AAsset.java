package com.example.quanlithietbi.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "A_ASSET", schema = "dbo")
public class AAsset {
    @Id
    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID", nullable = false)
    private String assetid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_PARENT")
    private String assetidParent;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_ORG")
    private String assetidOrg;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETDESC")
    private String assetdesc;

    @Column(name = "ASSETORD")
    private Double assetord;

    @Size(max = 255)
    @Nationalized
    @Column(name = "SITEID")
    private String siteid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "CATEGORYID")
    private String categoryid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "TYPEID")
    private String typeid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "MANDEPTIDLIST")
    private String mandeptidlist;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USESTATUS_LAST_ID")
    private String usestatusLastId;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USESTATUS_LAST_DTIME")
    private String usestatusLastDtime;

    @Size(max = 255)
    @Nationalized
    @Column(name = "SERIALNUM")
    private String serialnum;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_MANUFACTURERID")
    private String pManufacturerid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_VENDORID")
    private String pVendorid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_INSTALLDATE")
    private String pInstalldate;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_PRICE")
    private String pPrice;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_PRICEUOM")
    private String pPriceuom;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_PRICE_INC_ALL_CHILD")
    private String pPriceIncAllChild;

    @Size(max = 255)
    @Nationalized
    @Column(name = "P_MODEL")
    private String pModel;

    @Size(max = 255)
    @Nationalized
    @Column(name = "PRIORITY")
    private String priority;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USER_CR_ID")
    private String userCrId;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USER_CR_DTIME")
    private String userCrDtime;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USER_MDF_ID")
    private String userMdfId;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USER_MDF_DTIME")
    private String userMdfDtime;

    @Size(max = 255)
    @Nationalized
    @Column(name = "USESTATUS_UPDATE_ID")
    private String usestatusUpdateId;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETIDSORT")
    private String assetidsort;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ORGID")
    private String orgid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ULEVELID")
    private String ulevelid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETNOTE")
    private String assetnote;

    @Size(max = 255)
    @Nationalized
    @Column(name = "DATEOPRATOIN")
    private String dateopratoin;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_LINK")
    private String assetidLink;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_LINK1")
    private String assetidLink1;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_LINK2")
    private String assetidLink2;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_LINK3")
    private String assetidLink3;

    @Size(max = 255)
    @Nationalized
    @Column(name = "DATEMANUFACTURE")
    private String datemanufacture;

    @Size(max = 255)
    @Nationalized
    @Column(name = "NATIONALFACT")
    private String nationalfact;

    @Size(max = 255)
    @Nationalized
    @Column(name = "OWNER")
    private String owner;

    @Size(max = 255)
    @Nationalized
    @Column(name = "OWNER_LAST")
    private String ownerLast;

    @Size(max = 255)
    @Nationalized
    @Column(name = "OWNER_LAST_DTIME")
    private String ownerLastDtime;

    @Size(max = 255)
    @Nationalized
    @Column(name = "URL")
    private String url;

    @Column(name = "ASSETLEVEL")
    private Double assetlevel;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETINFO")
    private String assetinfo;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_FMIS")
    private String assetidFmis;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETID_CMIS")
    private String assetidCmis;

    @Column(name = "LOCK_MODE")
    private Double lockMode;

    @Column(name = "LOCK_NOTE")
    private Double lockNote;

    @Size(max = 255)
    @Nationalized
    @Column(name = "LOCK_DATE")
    private String lockDate;

    @Size(max = 255)
    @Nationalized
    @Column(name = "FILE_ATTACH_COUNTER")
    private String fileAttachCounter;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSET_CBM_TYPE")
    private String assetCbmType;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSET_CBM_GROUPID")
    private String assetCbmGroupid;

    @Size(max = 255)
    @Nationalized
    @Column(name = "ASSETDESC_ROOT")
    private String assetdescRoot;

}