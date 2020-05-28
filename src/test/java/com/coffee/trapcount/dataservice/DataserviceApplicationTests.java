package com.coffee.trapcount.dataservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DataserviceApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void getRanchByName() {

		String expected = "{\"id\": 3,\"name\": \"Riac\",\"description\": \"Description for Riac 3\",\"field1\": \"Value for text_field 5\",\"field2\": \"Value for text_field 6\"}";

		ResponseEntity<String> responseEntity = restTemplate.getForEntity("/ranches-data/Riac", String.class);



	}

}
