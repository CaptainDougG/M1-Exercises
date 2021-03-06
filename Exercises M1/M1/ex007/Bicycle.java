package ex007;

class Bicycle {
    
    private int forwardGear = 1;
    private int rearGear = 1;
    private boolean forwardBrake = false;
    private boolean rearBrake = false;
    
    //This is the constructor; you do not need to change the code
    public Bicycle(int forwardGear, int rearGear, boolean forwardBrake, boolean rearBrake) {
        this.forwardGear = forwardGear;
        this.rearGear = rearGear;
        this.forwardBrake = forwardBrake;
        this.rearBrake = rearBrake;
    }
    
	//these are the accessors
	public int getForwardGear() {
	    return this.forwardGear;
	}

	public int getRearGear() {
	    return this.rearGear;
	}
	
	public boolean getForwardBrake() {
	    return this.forwardBrake;
	}

	public boolean getRearBrake() {
	    return this.rearBrake;
	}

    //add the mutators here
	public int setForwardGear(int forwardGear) {
		return this.forwardGear = forwardGear;
	}
	
	public int setRearGear(int rearGear) {
		return this.rearGear = rearGear;
	}
	
	public boolean setForwardBrake(boolean forwardBrake) {
		return this.forwardBrake = forwardBrake;
	}
	
	public boolean setRearBrake(boolean rearBrake) {
		return this.rearBrake = rearBrake;
	}
	
}