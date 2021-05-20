package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTest {

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


	
	@ParameterizedTest
	@CsvSource({
		"1,1,1",
		"2,1,2"
	})
	void testDivide(int x, int y, int expected){
		int actual = Calculator.divide(x, y);
		assertEquals(expected, actual, "Šú‘Ò’l‚ÆŽÀÛ‚Ì’l‚ªˆÙ‚È‚è‚Ü‚·");
}
	
	
	@Test
	void exceptionTestDivide() {
		Calculator calc = new Calculator();
		assertThrows(IllegalArgumentException.class,()-> calc.divide(1,0));
	}
	
	
	
	
	
	
	

}
