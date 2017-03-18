package com.kumaran.rest.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.kumaran.bean.CalcBean;
import com.kumaran.helper.CalcUtil;

@RunWith(SpringRunner.class)
public class TestRestController {
	@Autowired
	CalcBean bean;
	private TestRestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void testAddService() {
		bean.setFirstVal(23);
		bean.setSecondVal(44);
		Integer result = CalcUtil.callService(bean);
	}
}
