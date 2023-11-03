package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		Main main = new Main();
		int result = main.add(1, 1);
		assertEquals(2, result);

		int res = main.add(1,4);
		assertEquals(5,res);
	}

}
