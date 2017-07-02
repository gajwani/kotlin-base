
package com.example.project;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class ExampleTests {

	@Test
	@DisplayName("A JUnit 5 Test 😎")
	void standardTest(TestInfo testInfo) {
		CalculatorJava calculator = new CalculatorJava();
		assertThat(calculator.add(1, 1)).isEqualTo(2);
		assertThat(testInfo.getDisplayName()).isEqualToIgnoringCase("A JUnit 5 Test 😎");
	}

	@Test
	@Disabled
	@DisplayName("2 is not equal to 1")
	void mySecondTest() {
		assertThat(2).isEqualTo(1);
	}
}
