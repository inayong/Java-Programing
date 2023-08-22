package mission;


public class Member {
	private String name;
	private int age;
	
	public Member() {
		name = "홍길동";
		age = 25;
	}

	public Member(String name, int age) { //source -> Generate Constructor using Fields -> Select All
		this.name = name;
		this.age = age;
	}

	public String getName() { //source -> Generate Getters and Setters -> Select All
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override  //source -> Generate toString() -> Fields 선택
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
