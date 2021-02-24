package ex006;

class Student {
       String lastName;
       String firstName;
       int ID;
	
    public Student(String lastName, String firstName, int ID) {
    	//set the instance variables to the initial values
    	this.lastName = lastName;
    	this.firstName = firstName;
    	this.ID = ID;
    	}
    
	//create the accessors here
    public String getLastName() {
    	return lastName;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public int getID() {
    	return ID;
    }
}