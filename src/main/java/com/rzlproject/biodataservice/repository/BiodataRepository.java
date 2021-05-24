package com.rzlproject.biodataservice.repository;

import com.rzlproject.biodataservice.entity.Biodata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Long> {
}
