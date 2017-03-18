package com.kumaran.web.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kumaran.bean.CalcBean;
import com.kumaran.helper.CalcUtil;


@Controller
@RequestMapping(value="web", method = RequestMethod.GET)
public class WebController {

	  private static Logger logger = Logger.getLogger(WebController.class);
	  
	@RequestMapping(value="home", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("Entering home");
		return new ModelAndView("calculator", "calcbean", new CalcBean());
	}

	@RequestMapping(value="add.do", method = RequestMethod.POST)
	public ModelAndView doAdd(@ModelAttribute("calcbean") @Valid CalcBean bean, BindingResult validationResult, ModelMap map) {
		logger.info("Entering add");
		Integer result = CalcUtil.callService(bean);
		if (validationResult.hasErrors()) {
			return new ModelAndView("calculator");
			
		}
		map.addAttribute("result", result);
		return new ModelAndView("calculator");
	}
}
