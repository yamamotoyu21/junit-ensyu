package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

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
			String actual = StringUtils.toSnakeCase("aaa");
			assertEquals("aaa", actual,"Šú‘Ò’l‚ÆÀÛ‚Ì·‚ª‚ ‚è‚Ü‚·" );
	}
	
	@Test
	void test2() {
			String actual = StringUtils.toSnakeCase("HelloWorld");
			assertEquals("hello_world", actual,"Šú‘Ò’l‚ÆÀÛ‚Ì·‚ª‚ ‚è‚Ü‚·" );
	}
	
	@Test
	void test3() {
			String actual = StringUtils.toSnakeCase("practiceJunit");
			assertEquals("practice_junit", actual,"Šú‘Ò’l‚ÆÀÛ‚Ì·‚ª‚ ‚è‚Ü‚·" );
	}
	

}
