package com.kumaran.calc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalcApplication.class)
@WebAppConfiguration
public class CalcApplicationTests {

	MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() {
		// TODO Auto-generated method stub
		this.mockMvc = webAppContextSetup(webApplicationContext).build();

	}

	@Test
	public void testController_success() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(get("/rest/add?firstVal=5&secondVal=5").contentType(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().is2xxSuccessful());

	}

	@Test
	public void testController_fail() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(post("/rest/add?firstVal=5&secondVal=5").contentType(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isMethodNotAllowed());

	}

	@Test
	public void testController_checkValue() throws Exception {
		// TODO Auto-generated method stub
		mockMvc.perform(get("/rest/add?firstVal=6&secondVal=5").contentType(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.content().string("11"));

	}
}
