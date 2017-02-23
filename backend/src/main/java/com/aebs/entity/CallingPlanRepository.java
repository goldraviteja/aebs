package com.aebs.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CallingPlanRepository extends CrudRepository<CallingPlan, String> {
	CallingPlan findById(@Param("id") Long id);

	List<CallingPlan> findByAtn(@Param("atn") String atn);

	

}
