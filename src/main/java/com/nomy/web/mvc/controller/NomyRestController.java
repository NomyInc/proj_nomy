package com.nomy.web.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nomy.common.NomyConstants;
import com.nomy.common.bo.JsonExceptionBo;
import com.nomy.common.bo.PartyBo;
import com.nomy.persistence.dao.PartyDao;
import com.nomy.persistence.dao.PartyDaoImpl;


@Controller
public class NomyRestController {
	
	private PartyDao partyDao;
	
	@RequestMapping(value = "/rest/partyBo.html")
	public String restGetPartyBo(Model model)
	{
		List<PartyBo> partyBoList = new ArrayList();
		
		
		PartyBo partyBo = new PartyBo();
		partyBo.setId(111);
		partyBo.setPartyTypeCd("whatever");
		
		PartyBo partyBo1 = new PartyBo();
		partyBo1.setId(222);
		partyBo1.setPartyTypeCd("222");
/*		DateTime current = new DateTime();
		JsonExceptionBo jsonException = new JsonExceptionBo();*/
		
		
		partyBoList.add(partyBo);
		partyBoList.add(partyBo1);
		
		// add to model for json template
		model.addAttribute("partyBoList", partyBoList);
		//model.addAttribute("partyBoList", partyBo.getPartyTypeCd());
		return NomyConstants.JSON_TEMPLATE;

		//return partyBo;
	}
	
	@RequestMapping(value = "/rest/getCurrentDateTime.html")
	public String restGetLatestDayAheadForecastDate(Model model)
	{
	
		DateTime current = new DateTime();
		JsonExceptionBo jsonException = new JsonExceptionBo();
		
		// add to model for json template
		model.addAttribute("currentDateTime", current);
		model.addAttribute("exception", jsonException);
		return NomyConstants.JSON_TEMPLATE;

		
		}

	public PartyDao getPartyDao() {
		return partyDao;
	}

	
	@Autowired
	public void setPartyDao(PartyDao partyDao) {
		this.partyDao = partyDao;
	}


}
