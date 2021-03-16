package com.erp.financial.maximus.endpoint.adapter;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;

import com.erp.financial.maximus.endpoint.dto.AdCompanyDTO;
import com.erp.financial.maximus.entity.AdCmpny;

public class AdCompanyAdapter {
	private static final Logger LOG = LoggerFactory.getLogger(AdCompanyAdapter.class);
	
	public static final AdCmpny createDTOtoEntityParser(@RequestBody AdCompanyDTO cmpDTO)throws ParseException {
		AdCmpny cmp = new AdCmpny();
		cmp.setCmpShrtNm(cmpDTO.getCmpShortName());
		cmp.setCmpNm(cmpDTO.getCmpName());
		cmp.setCmpDesc(cmpDTO.getCmpDescription());
		cmp.setCmpTin(cmpDTO.getCmpTin());
		return cmp;
	}

}
