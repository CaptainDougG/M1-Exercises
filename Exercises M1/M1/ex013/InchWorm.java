package ex013;

public class InchWorm {
	
	public int position;
	public int direction;
	
	public InchWorm() {
		position = 0;
		direction = 1;
	}
	
	public InchWorm(int position) {
		this.position = position;
		direction = 1;
	}

	public int move(){
		if (direction == 1) {
			position = position + 1;
			return position;
		}
		else {
			position = position - 1;
			return position;
		}
	}
	
	public int turn() {
		if (direction == 1) {
			direction = -1; 
			return direction;
		}
		else {
			direction =1;
			return direction;
		}
	}
	
	public int getPosition() {
		return position;
	}
	
	public int getDirection() {
		return direction;
	}
}

