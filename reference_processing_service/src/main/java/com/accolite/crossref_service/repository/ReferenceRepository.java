package com.accolite.crossref_service.repository;

import com.accolite.crossref_service.entity.ReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferenceRepository extends JpaRepository<ReferenceEntity, String> {

}
