package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		
			ItemStock itemstock = new ItemStock();
			Item book = new Item("book",1000);
			
			int actual = itemstock.getNum(book);
			assertEquals(0, actual, "期待値と実際の値が異なります");
						
			}
	@Test
	void test2() {
		
			ItemStock itemstock = new ItemStock();
			Item book = new Item("book",1000);
			itemstock.add(book);
			
			int actual = itemstock.getNum(book);
			assertEquals(1, actual, "期待値と実際の値が異なります");
						
			}
	

	@Test
	void test4() {
		
			ItemStock itemstock = new ItemStock();
			Item book = new Item("book",1000);
			Item cd = new Item("cd",2000);
			
			itemstock.add(book);
			itemstock.add(book);
			
			int actual = itemstock.getNum(book);
			assertEquals(2, actual, "期待値と実際の値が異なります");
						
			}
	@Test
	void test5() {
		
			ItemStock itemstock = new ItemStock();
			Item book = new Item("book",1000);
			Item cd = new Item("cd",2000);
			
			itemstock.add(book);
			itemstock.add(cd);
			
			int actual = itemstock.getNum(book);
			assertEquals(1, actual, "期待値と実際の値が異なります");
						
			}

		
		
		
		
		
		
		
	}


