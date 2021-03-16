package com.erp.financial.maximus.endpoint;

import java.text.ParseException;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.financial.maximus.endpoint.adapter.AdCompanyAdapter;
import com.erp.financial.maximus.endpoint.dto.AdCompanyDTO;
import com.erp.financial.maximus.endpoint.dto.ResponseMessageDTO;
import com.erp.financial.maximus.entity.AdCmpny;
import com.erp.financial.maximus.exception.InvalidRequestException;
import com.erp.financial.maximus.properties.ResponseProperties;
import com.erp.financial.maximus.services.AdCompanyService;

import springfox.documentation.service.ResponseMessage;

@RestController
@RequestMapping("/v1/company")
@CrossOrigin
@Validated
public class AdCompanyController {
	private static final Logger LOG = LoggerFactory.getLogger(AdCompanyController.class);
	
	@Autowired
	private ResponseProperties resProperties;
	
	@Autowired
	private AdCompanyService cmpService;
	
	private static final String CMP_CREATE_ERROR="Company was not created. Encounter error during creation.";
	private static final String CMP_CREATE_SUCCESSFULL="Company was successfully created.";
	private static final String CMP_CMP_NOT_EXIST="Company Code was not Exist.";
	private static final String CMP_UPDATE_ERROR="Company was not updated. Encounter error during creation.";
	private static final String CMP_UPDATE_SUCCESSFULL="Company was successfully updated.";
	
	@PostMapping("/create")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<ResponseMessageDTO> createCompany(@RequestBody AdCompanyDTO cmpDTO) {
		ResponseEntity<ResponseMessage> response = null;
		LOG.info("AdCompanyController createCompany ");
		
		AdCmpny cmp = null;
		try {
			cmp = AdCompanyAdapter.createDTOtoEntityParser(cmpDTO);
		} catch (ParseException e) {
			throw new InvalidRequestException();
		}
		int cmpCode = 0;
		if(cmp!=null) {
			cmpCode = cmpService.createCompany(cmp);
		}
		 if(cmpCode==0) {
			 throw new InvalidRequestException(CMP_CREATE_ERROR);
		 }
		
		ResponseMessageDTO successDto = new ResponseMessageDTO();
		successDto.setStatusCode(HttpStatus.OK.value());
		successDto.setTimestamp(Calendar.getInstance().getTime());
		successDto.setMessage(CMP_CREATE_SUCCESSFULL);
		successDto.setDescription(HttpStatus.OK.toString());
		successDto.setType(resProperties.getTypeSuccess());
		LOG.info("AdCompanyController createCompany end");
		return new ResponseEntity<ResponseMessageDTO>(successDto, HttpStatus.OK);
		
	}
	
	
	@PostMapping("/update")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<ResponseMessageDTO> updateCompany(@RequestBody AdCompanyDTO cmpDTO) {
		ResponseEntity<ResponseMessage> response = null;
		LOG.info("AdCompanyController updateCompany ");
		
		if(cmpDTO.getCmpCode()<=0) {
			throw new InvalidRequestException(CMP_CMP_NOT_EXIST);
		}
		AdCmpny cmp = null;
		try {
			cmp = AdCompanyAdapter.createDTOtoEntityParser(cmpDTO);
			cmp.setCmpCode(cmpDTO.getCmpCode());
		} catch (ParseException e) {
			throw new InvalidRequestException();
		}
		int updateRow = 0;
		if(cmp.getCmpCode()>0) {
			 updateRow = cmpService.createCompany(cmp);
		}
		 if(updateRow==0) {
			 throw new InvalidRequestException(CMP_UPDATE_ERROR);
		 }
		
		ResponseMessageDTO successDto = new ResponseMessageDTO();
		successDto.setStatusCode(HttpStatus.OK.value());
		successDto.setTimestamp(Calendar.getInstance().getTime());
		successDto.setMessage(CMP_UPDATE_SUCCESSFULL);
		successDto.setDescription(HttpStatus.OK.toString());
		successDto.setType(resProperties.getTypeSuccess());
		LOG.info("AdCompanyController updateCompany end");
		return new ResponseEntity<ResponseMessageDTO>(successDto, HttpStatus.OK);
		
	}
	
	
}
