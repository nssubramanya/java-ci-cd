package com.subbu.maven.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private final Calculator calc = new Calculator();
	
	@BeforeAll
	static void setup() {
//		calc = new Calculator();
	}

	@Test
	@DisplayName("Integer addition")
	void testAdd() {
		assertEquals(60, calc.add(50,10));
	}
	
	@Test
	@DisplayName("Double Addition")
	void testSubtract() {
		assertEquals(20.56, calc.add(10.56,10));
	}

}
