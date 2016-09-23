import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBowling {

	Frame test;
	int firstThrow = 0;
	int secondThrow = 0;
	@Before
	public void setUp(){
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

}
