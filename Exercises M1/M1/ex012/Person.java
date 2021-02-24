package ex012;

public class Person {
	
	//Instance Variables
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	
	//Constructors
	public Person(String firstName, String lastName, int birthMonth, int birthDay, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}
	
	//Accessors
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getBirthMonth() {
		return birthMonth;
	}
	
	public int getBirthDay() {
		return birthDay;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public String getBirthday() {
		return birthMonth + "/" + birthDay + "/" + birthYear;
	}
	
	//Mutators
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setBirthMonth(int birthMonth) {
		if (birthMonth >= 1 && birthMonth <= 12) {
			this.birthMonth = birthMonth;
		}	
	}
	
	public void setBirthDay(int birthDay) {
		if (birthDay >= 1 && birthDay <= 31) {
			this.birthDay = birthDay;
		}
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
