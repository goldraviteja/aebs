package com.aebs.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OccRefRepository extends CrudRepository<OccRef, Integer> {
 List<OccRef> findByMultiplier(@Param("Multiplier") int multiplier);
}
