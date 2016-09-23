import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	//returns number of frames
	public int getNumberOfFrames(){
		int numberOfFrames = 0;
		numberOfFrames = frames.size();
		return numberOfFrames;
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		for(int i = 0; i < frames.size(); i++){
			int firstThrow = frames.get(i).getFirstThrow();
			int secondThrow = frames.get(i).getSecondThrow();
			gameScore = gameScore + firstThrow + secondThrow;
		}	
		return gameScore;
	}
}
