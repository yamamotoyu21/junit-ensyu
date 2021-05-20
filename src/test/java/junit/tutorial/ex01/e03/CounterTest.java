package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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
	void testIncrement1() {
		Counter counter = new Counter();
		int actual = counter.increment();
		assertEquals(1, actual,"期待値と実際の値が異なります");

	}
	@Test
	void testIncrement2() {
		Counter counter = new Counter();
		
		
		for(int i = 0; i <=50; i++) {
			 
			 int actual = counter.increment();
			
			
			if(i == 0) {
				assertEquals(1, actual,"期待値と実際の値が異なります");
			}else if(i == 1) {
				assertEquals(2, actual,"期待値と実際の値が異なります");
			}else if(i == 50) {
				assertEquals(51, actual,"期待値と実際の値が異なります");
			}
		
		}
		
	
		
		
		
		

	}

}
