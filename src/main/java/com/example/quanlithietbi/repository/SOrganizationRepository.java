package com.example.quanlithietbi.repository;

import com.example.quanlithietbi.entity.SOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SOrganizationRepository extends JpaRepository<SOrganization, String> {

    String QUERY = "SELECT * FROM [dbo].[S_ORGANIZATION] WHERE ORGID = :orgid";

    @Query(value = QUERY, nativeQuery = true)
    Optional<SOrganization> findByOrgid(String orgid);
}
