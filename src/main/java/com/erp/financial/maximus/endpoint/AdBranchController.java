package com.erp.financial.maximus.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.financial.maximus.properties.ResponseProperties;

@RestController
@RequestMapping("/v1/branch")
@CrossOrigin
@Validated
public class AdBranchController {
private static final Logger LOG = LoggerFactory.getLogger(AdBranchController.class);
	
	@Autowired
	private ResponseProperties resProperties;
}
