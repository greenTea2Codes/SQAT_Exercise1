import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBowling {

	Frame testFrame;
	int firstThrow;
	int secondThrow;
	BowlingGame testBowlingGame; 
	@Before
	public void setUp(){
		firstThrow = 0;
		secondThrow = 0;
		testFrame = new Frame(firstThrow, secondThrow);	
		testBowlingGame = new BowlingGame();
	}
	@Test
	public void testFrame_score() {
		//int firstThrow = 4;
		//int secondThrow = 5;
		//Frame test = new Frame( firstThrow, secondThrow );
		testFrame.updateScore_FirstThrow(5);
		testFrame.updateScore_SecondThrow(4);
		assertEquals(9, testFrame.score());
	}
	@Test
	public void testFrame_isStrike(){
		testFrame.updateScore_FirstThrow(10);
		assertTrue(testFrame.isStrike());
	}
	@Test
	public void testFrame_isNotStrike(){
		testFrame.updateScore_FirstThrow(5);
		assertFalse(testFrame.isStrike());
	}
	@Test 
	public void testFrame_isSpare(){
		testFrame.updateScore_SecondThrow(10);
		assertTrue(testFrame.isSpare());
	}
	@Test 
	public void testFrame_isNotSpare(){
		testFrame.updateScore_SecondThrow(9);
		assertFalse(testFrame.isSpare());
	}
	@Test
	public void testBowlingGame_getIniNumberOfFrames(){
		int numOfFrames = testBowlingGame.getNumberOfFrames();
		assertEquals(0, numOfFrames);
	}
	@Test
	public void testBowlingGame_addFrame(){
		testBowlingGame.addFrame(testFrame);
		fail("not implemented");
	}


}
