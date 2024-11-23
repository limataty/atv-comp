package com.example.atv_comp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AtvCompApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testSoma() {
		ResponseEntity<Double> response = restTemplate.getForEntity("/soma?a=10&b=20", Double.class);
		assertEquals(30.0, response.getBody());
	}

	@Test
	public void testSubtracao() {
		ResponseEntity<Double> response = restTemplate.getForEntity("/subtracao?a=30&b=10", Double.class);
		assertEquals(20.0, response.getBody());
	}

	@Test
	public void testMultiplicacao() {
		ResponseEntity<Double> response = restTemplate.getForEntity("/multiplicacao?a=5&b=4", Double.class);
		assertEquals(20.0, response.getBody());
	}

	@Test
	public void testDivisao() {
		ResponseEntity<Double> response = restTemplate.getForEntity("/divisao?a=20&b=4", Double.class);
		assertEquals(5.0, response.getBody());
	}
}
