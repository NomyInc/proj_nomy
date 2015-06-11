package com.nomy.web.mvc.controller;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nomy.common.NomyConstants;
import com.nomy.common.bo.JsonExceptionBo;

@Controller
public class NomyRestController {

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
}
