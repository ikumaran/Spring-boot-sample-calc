package com.kumaran.helper;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestMethod;

import javax.ws.rs.client.Invocation.Builder;


import com.kumaran.bean.CalcBean;

public class CalcUtil {
	public static Integer callService(CalcBean bean) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/rest/add").queryParam("firstVal", bean.getFirstVal())
				.queryParam("secondVal", bean.getSecondVal());
		Integer result = target.request().get().readEntity(Integer.class);
		return result;
	}
}
