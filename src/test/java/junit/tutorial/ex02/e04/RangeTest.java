package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RangeTest {

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
		"0.0, 10.5,-0.1,false",
		"0.0, 10.5,0.0,true",
		"0.0, 10.5,10.5, true",
		"0.0, 10.5,10.6,false",
		"-5.1,5.1,-5.2,false",
		"-5.1,5.1,0.0,true",
		"-5.1,5.1,5.1,true",
		"-5.1,5.1,5.2,false",
	})
	void testContains(double min, double max, double value, boolean expected) {
		Range range = new Range();
		range.setMin(min);
		range.setMax(max);
		boolean actual = range.contains(value);
		assertEquals(expected,actual, "期待値と実際の値が異なります");
	}
	


}
