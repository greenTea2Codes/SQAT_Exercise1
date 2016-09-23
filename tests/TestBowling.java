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
		int numOfFrames = testBowlingGame.getNumberOfFrames();
		assertEquals(1, numOfFrames);
		//fail("not implemented");
	}
	@Test
	public void testBowlingGame_score_90_noBonus(){
		testFrame.updateScore_FirstThrow(5);
		testFrame.updateScore_SecondThrow(4);
		for(int i = 0; i < 10; i++){
			testBowlingGame.addFrame(testFrame);
		}
		int gameScore = testBowlingGame.score();
		assertEquals(90, gameScore);
	}
	@Test
	public void testBowlingGame_getBonusFrame(){
		assertNull(testBowlingGame.getBonusFrame());
	}
	@Test
	public void testBowlingGame_setBonus_5_4(){
		testBowlingGame.setBonus(5, 4);
		Frame bonus = testBowlingGame.getBonusFrame();
		assertEquals(9, bonus.score());
		//fail("not implemented");
	}


}
