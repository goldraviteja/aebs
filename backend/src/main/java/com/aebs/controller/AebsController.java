package com.aebs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aebs.entity.Charge;
import com.aebs.utils.ResponseEntity;
import com.aebs.utils.ResponseUtils;
import com.aebs.vo.CallcFormVo;

@RestController
@RequestMapping("/aebs")
public class AebsController {

	@RequestMapping(value = "/getDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getDetails(@RequestBody CallcFormVo callcVo) {

		// List<Charge> chargesList = chargeRepository.findByAtnSummary(atn);

		List<Charge> chargesList = new ArrayList<Charge>();
		System.out.println(chargesList.size());

		return ResponseUtils.renderSuccess("ok",HttpStatus.OK);
	}
}
