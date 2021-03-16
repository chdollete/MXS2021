package com.erp.financial.maximus.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/login")
@CrossOrigin
@Validated
public class LoginController {
	private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
}
