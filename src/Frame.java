public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//update score for a throw
	public void updateScore_FirstThrow(int score){
		firstThrow = score;
	}
	public void updateScore_SecondThrow(int score){
		secondThrow = score;
	}
	//returns the score of a single frame
	public int score(){
		
		return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		boolean isStrike = false;
		if(firstThrow == 10){
			isStrike = true;
		}
		else{
			isStrike = false;
		}
		return isStrike;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		boolean isSpare = false;
		int frameScore = score();
		if(firstThrow < 10 && frameScore == 10){
			isSpare = true;
		}
		else
		{
			isSpare = false;
		}
		return isSpare;
	}
	
}
