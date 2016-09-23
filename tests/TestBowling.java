import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testFrame_score() {
		int firstThrow = 4;
		int secondThrow = 5;
		Frame test = new Frame( firstThrow, secondThrow );
		assertEquals(9, test.score());
	}

}
