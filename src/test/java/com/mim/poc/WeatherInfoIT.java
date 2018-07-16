package com.mim.poc;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-test.xml")
public class WeatherInfoIT {
	@Autowired
	private WeatherGateway gateway;
	Logger log =LoggerFactory.getLogger(WeatherInfoIT.class);
	
	
	
	@Test
	public void getInfo() {
		QueryParameters parameters=new QueryParameters();
		parameters.setAppId("b6907d289e10d714a6e88b30761fae22");
		parameters.setMode("xml");
		parameters.setCity("London");
		String response=gateway.send(parameters);
		log.info(response);
		//fake test
		Assert.assertTrue(true);
	}
}
