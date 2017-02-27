package com.aebs.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import com.aebs.vo.CallcDetailsVO;

@Repository("chargeDao")
public class ChargeDaoImpl implements ChargeDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<CallcDetailsVO> getATNSummaryDetails(String atn, int month, int year) {
		Session session = (Session) entityManager.getDelegate();
		
		String yearMonth = year+ "" + month;
		StringBuilder queryString = new StringBuilder(
				"SELECT usoc, SUM(qty) as qty, SUM(full_amt)/SUM(qty) as cost, SUM(full_amt) as amount, occ"
						+ " FROM charge c WHERE c.full_amt != 0 AND c.occ IN ('08', '26') ");
		
		if(atn != null) {
			queryString.append("AND c.atn IN (:atn)");
		}
		
		if(yearMonth != null) {
			queryString.append(" AND c.billing_cycle LIKE :yearMonth");
		}
		
		queryString.append(" GROUP BY c.usoc, c.occ, c.full_amt/c.qty ");
		
		SQLQuery query = session.createSQLQuery(queryString.toString());
		
		query.setParameter("atn", atn);
		query.setParameter("yearMonth", "%" + yearMonth + "%");
		
		return (List<CallcDetailsVO>) query.setResultTransformer(Transformers.aliasToBean(CallcDetailsVO.class)).list();
	}

}
