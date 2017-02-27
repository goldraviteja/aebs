package com.aebs.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aebs.dao.ChargeDao;
import com.aebs.entity.ChargeRepository;
import com.aebs.utils.ResponseEntity;
import com.aebs.utils.ResponseUtils;
import com.aebs.vo.CallcDetailsVO;
import com.aebs.vo.CallcFormVO;

@RestController
@RequestMapping("/aebs")
public class AebsController {
	
	@Autowired
	ChargeRepository chargeRepository;
	
	@Autowired
	ChargeDao chargeDao;
	
	final static String searchByATN = "ATN";
	final static String searchByUSOC = "USOC";
	final static String searchByWTN = "WTN";

	@RequestMapping(value = "/getDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CallcDetailsVO>> getDetails(@RequestBody CallcFormVO callcForm) {
		 
		List<CallcDetailsVO> callcDetailsVoList = new ArrayList<CallcDetailsVO>();
		
		if(StringUtils.endsWithIgnoreCase(searchByATN, callcForm.getSearchBy())) {
			callcDetailsVoList = chargeDao.getATNSummaryDetails(callcForm.getSearchByText(), callcForm.getMonth(), callcForm.getYear());
		} else {
			// TODO:
		}

		
		
		return ResponseUtils.renderSuccess(callcDetailsVoList, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getATNDetails", method = RequestMethod.GET)
	public ResponseEntity<List<CallcDetailsVO>> getATNDetails(@RequestParam String atnValue) {

		List<CallcDetailsVO> callcDetailsVoList = chargeDao.getATNSummaryDetails(atnValue, 0 , 0);

		return ResponseUtils.renderSuccess(callcDetailsVoList, HttpStatus.OK);
	}
	
}
