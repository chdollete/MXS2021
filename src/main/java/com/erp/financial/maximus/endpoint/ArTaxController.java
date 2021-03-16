package com.erp.financial.maximus.endpoint;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

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

import com.erp.financial.maximus.endpoint.adapter.ArTaxAdapter;
import com.erp.financial.maximus.endpoint.dto.ArTaxDTO;
import com.erp.financial.maximus.endpoint.dto.ResponseMessageDTO;
import com.erp.financial.maximus.entity.ArTxCd;
import com.erp.financial.maximus.exception.InvalidRequestException;
import com.erp.financial.maximus.exception.RecordNotFoundException;
import com.erp.financial.maximus.properties.ResponseProperties;
import com.erp.financial.maximus.services.ArTaxService;

import springfox.documentation.service.ResponseMessage;

@RestController
@RequestMapping("/v1/ar/tax")
@CrossOrigin
@Validated
public class ArTaxController {
	private static final Logger LOG = LoggerFactory.getLogger(ArTaxController.class);
	
	@Autowired
	private ResponseProperties resProperties;
	
	@Autowired
	private ArTaxService taxService;
	
	private static final String AR_CREATE_SUCCESSFULL="Receivable Tax was successfully created.";
	private static final String INVALID_REQUEST_INPUT="Invalid Request Input.";
	private static final String AR_CREATE_ERROR="Receivable Tax was not created. Encounter error during creation.";
	private static final String AR_UPDATE_SUCCESSFULL="Receivable Tax was successfully updated.";
	
	@PostMapping("/create")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<ResponseMessageDTO> createTax(@RequestBody ArTaxDTO taxDTO) throws ParseException{
		LOG.info("ArTaxController createTax");
		ResponseEntity<ResponseMessage> response = null;
		ArTxCd tax = null;
		
		try {
			tax = ArTaxAdapter.arTaxDTOtoEntityParser(taxDTO);
		} catch (ParseException e) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}

		int tx_cd = 0;
		if(tax!=null) {
			tx_cd = taxService.createTax(tax);
		}
		if(tx_cd<=0) {
			throw new InvalidRequestException(AR_CREATE_ERROR);
		}
		
		ResponseMessageDTO successDto = new ResponseMessageDTO();
		successDto.setStatusCode(HttpStatus.OK.value());
		successDto.setTimestamp(Calendar.getInstance().getTime());
		successDto.setMessage(AR_CREATE_SUCCESSFULL);
		successDto.setDescription(HttpStatus.OK.toString());
		successDto.setType(resProperties.getTypeSuccess());
		LOG.info("ArTaxController createTax end");
		return new ResponseEntity<ResponseMessageDTO>(successDto, HttpStatus.OK);
	}
	
	@PostMapping("/update")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<ResponseMessageDTO> updateTax(@RequestBody ArTaxDTO taxDTO) throws ParseException{
		LOG.info("ArTaxController updateTax");
		ResponseEntity<ResponseMessage> response = null;
		ArTxCd tax = null;
		if(taxDTO==null) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}
		
		try {
			tax = ArTaxAdapter.arTaxDTOtoEntityParser(taxDTO);
			tax.setTcCode(taxDTO.getTaxCode());
		} catch (ParseException e) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}

		
		if(tax!=null) {
			taxService.updateTax(tax);
		}
				
		ResponseMessageDTO successDto = new ResponseMessageDTO();
		successDto.setStatusCode(HttpStatus.OK.value());
		successDto.setTimestamp(Calendar.getInstance().getTime());
		successDto.setMessage(AR_UPDATE_SUCCESSFULL);
		successDto.setDescription(HttpStatus.OK.toString());
		successDto.setType(resProperties.getTypeSuccess());
		LOG.info("ArTaxController updateTax end");
		return new ResponseEntity<ResponseMessageDTO>(successDto, HttpStatus.OK);
	}
	
	
	@PostMapping("/find")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<ArTaxDTO> getTaxByTaxName(@RequestBody ArTaxDTO taxDTO) throws ParseException{
		LOG.info("ArTaxController getTaxByTaxName");
		ResponseEntity<ArTaxDTO> response = null;
		ArTaxDTO arTaxDTO = null;
		
		if(taxDTO.getTaxName()==null || (taxDTO.getTaxName()!=null && taxDTO.getTaxName().trim().length()==0)) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}
		if(taxDTO.getTaxCmpCode()<=0) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}
		
		ArTxCd tax = taxService.findArTaxbyTaxName(taxDTO.getTaxName(), taxDTO.getTaxCmpCode());	
		
		if(tax==null) {
			throw new RecordNotFoundException("No Records Found");
		}
		arTaxDTO = ArTaxAdapter.arTaxEntityToDTOParser(tax);

		LOG.info("ArTaxController getTaxByTaxName end");
		return new ResponseEntity<ArTaxDTO>(arTaxDTO, HttpStatus.OK);
	}
	
	
	@PostMapping("/list")
	@PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
	public ResponseEntity<List<ArTaxDTO>> getTaxListByTaxCmpCode(@RequestBody ArTaxDTO taxDTO) throws ParseException{
		LOG.info("ArTaxController getTaxByTaxName");
		ResponseEntity<List<ArTaxDTO>> response = null;
		ArTaxDTO arTaxDTO = null;
		
		if(taxDTO.getTaxCmpCode()<=0) {
			throw new InvalidRequestException(INVALID_REQUEST_INPUT);
		}
		
		List<ArTxCd> taxList = taxService.findArTaxListByCmpCode(taxDTO.getTaxCmpCode());	
		
		if(taxList==null || taxList.size()==0) {
			throw new RecordNotFoundException("No Records Found");
		}
		List<ArTaxDTO> arTaxListDTO = ArTaxAdapter.arTaxEntityListToDTOListParser(taxList);

		LOG.info("ArTaxController getTaxByTaxName end");
		return new ResponseEntity<List<ArTaxDTO>>(arTaxListDTO, HttpStatus.OK);
	}
	
	
}
