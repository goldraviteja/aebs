package com.aebs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aebs.entity.Charge;
import com.aebs.entity.ChargeRepository;
import com.aebs.utils.ResponseEntity;
import com.aebs.utils.ResponseUtils;
import com.aebs.vo.CallcFormVo;

@RestController
@RequestMapping("/aebs")
public class AebsController {
	
	@Autowired
	ChargeRepository chargeRepository;

	@RequestMapping(value = "/getDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Charge>> getDetails(@RequestBody CallcFormVo callcVo) {

		List<Charge> chargesList = chargeRepository.findByAtnSummary(callcVo.getSearchByText());

		System.out.println(" List of change records" + chargesList.size());
		return ResponseUtils.renderSuccess(chargesList,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getATNDetails", method = RequestMethod.GET)
	public ResponseEntity<List<Charge>> getATNDetails(@RequestParam String atnValue) {

		List<Charge> chargesList = chargeRepository.findByAtnSummary(atnValue);

		return ResponseUtils.renderSuccess(chargesList,HttpStatus.OK);
	}
	
}
