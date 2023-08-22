package mission;

public class Member2 {
	private String name;
	private int age;
	private char gender;
	
	public Member2() {
		name = "Hong";
		age = 20;
		gender = 'F';
	}

	public Member2(char gender) {
		super();
		this.gender = gender;
	}

	public Member2(String name1) {
		super();
		name = name1; //이렇게도 가능 
	}

	public Member2(int age) {
		super();
		this.age = age;
	}
	
	public static void main(String[] args) {
		System.out.println();
	}
}
