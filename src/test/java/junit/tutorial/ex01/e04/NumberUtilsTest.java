package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		boolean actual = NumberUtils.isEven(10);
		assertEquals(true, actual,"期待値と実際の値が異なります");
	}
	
	@Test
	void test2() {
		boolean actual = NumberUtils.isEven(7);
		assertEquals(false, actual,"期待値と実際の値が異なります");
		
		
	}

}
