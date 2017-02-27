package com.aebs.dao;

import java.util.List;

import com.aebs.vo.CallcDetailsVO;

public interface ChargeDao {

	public List<CallcDetailsVO> getATNSummaryDetails(String atn, int month, int year);
}
