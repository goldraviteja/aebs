package com.aebs.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource
@Transactional
public interface ChargeRepository extends JpaRepository<Charge, Long> {

@Query("select fullAmt from Charge c where c.atn=?1")
 List<Charge> findByAtn(@Param("atn") String atn);
 List<Charge> findByWtn(@Param("wtn") String wtn);
 List<Charge> findByUsoc(@Param("usoc") String usoc);

 @Query("SELECT usoc, sum(qty) as qty, sum(fullAmt)/sum(qty) as cost, sum(fullAmt) as amount, occ "
 		+ "FROM Charge c WHERE c.atn IN(:atn) "
 		+ "AND c.fullAmt != 0 AND c.occ IN ('08', '26') "
 		+ "group by c.usoc, c.occ, c.fullAmt/c.qty")
 public List<Charge> findByAtnSummary(@Param("atn") String atn);
 
}

