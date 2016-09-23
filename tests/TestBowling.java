import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBowling {

	Frame test;
	int firstThrow;
	int secondThrow;
	@Before
	public void setUp(){
		firstThrow = 0;
		secondThrow = 0;
		test = new Frame(firstThrow, secondThrow);	
	}
	@Test
	public void testFrame_score() {
		//int firstThrow = 4;
		//int secondThrow = 5;
		//Frame test = new Frame( firstThrow, secondThrow );
		test.updateScore_FirstThrow(5);
		test.updateScore_SecondThrow(4);
		assertEquals(9, test.score());
	}
	@Test
	public void testFrame_isStrike(){
		test.updateScore_FirstThrow(10);
		assertTrue(test.isStrike());
	}
	@Test
	public void testFrame_isNotStrike(){
		test.updateScore_FirstThrow(5);
		assertFalse(test.isStrike());
	}
	@Test 
	public void testFrame_isSpare(){
		test.updateScore_SecondThrow(10);
		assertTrue(test.isSpare());
	}

}
