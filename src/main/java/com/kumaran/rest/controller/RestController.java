package com.kumaran.rest.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "rest", method = RequestMethod.GET)
public class RestController {

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public Integer addService(@QueryParam("firstVal") Integer firstVal, @QueryParam("secondVal") Integer secondVal) {
		if (validate (firstVal, secondVal)) {
			return firstVal+secondVal;
		}
		return null;
	}

	private boolean validate(Integer firstVal, Integer secondVal) {
		if (firstVal !=null && secondVal!=null) {
			return true;
		}
		return false;
	}
}
