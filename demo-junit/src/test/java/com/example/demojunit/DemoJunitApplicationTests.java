package com.example.demojunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoJunitApplicationTests {

	public boolean isNumberEven(int number) {
		return number % 2 == 0;
	}
	@Test
	void shouldReturnTrueWhenNumberIsEven() {
      // given
		int oddNumber = 8;

		// when
		boolean result = isNumberEven(oddNumber);

		// then
		Assertions.assertTrue(result);
	}

	@Test
	void shouldReturnFalseWhenNumberIsFalse() {
		// given
		int oddNumber = 3;

		// when
		boolean result = isNumberEven(oddNumber);

		// then
		Assertions.assertFalse(result);
	}
}


