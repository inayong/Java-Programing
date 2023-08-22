package mission;

class Person {
	//pid, name, age
	int pid;
	String name;
	int age;
	
	public Person(int pid, String name, int age) {
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return + pid + " : " + name + " : " + age;
	}
}
class Student extends Person {
	//sid, dept, year
	int sid;
	String dept;
	int year;
	
	public Student(int pid, String name, int age, int sid, String dept, int year) {
		super(pid, name, age);
		this.sid = sid;
		this.dept = dept;
		this.year = year;
	}
	
	public String toString() {
		return "<S> " + sid + " : " + dept + " : " + year;
	}
}
class Employee extends Person {
	//eno, dept, salary
	int eid;
	String dept;
	int salary;
	
	public Employee(int pid, String name, int age, int eid, String dept, int salary) {
		super(pid, name, age);
		this.eid = eid;
		this.dept = dept;
		this.salary = salary;
	}
	public String toString() {
		return "<E> " + eid + " : " + dept + " : " + salary;
	}
}


public class TestStudentEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person arr[] = new Person[5];
		arr[0] = new Student(230810, "hong", 23, 4001, "kdt", 4); //파라미터는 알아서 입력
		arr[1] = new Employee(232323, "kim", 30, 2323, "manage", 300);
		arr[2] = new Student(221008, "jang", 20, 1008, "computer", 1);
		arr[3] = new Employee(202020, "lee", 28, 2020, "data", 350);
		arr[4] = new Employee(212121, "park", 25, 2121, "ad", 330);
		for(Person p : arr) {
			System.out.println(p.toString());
		}

	}
}
