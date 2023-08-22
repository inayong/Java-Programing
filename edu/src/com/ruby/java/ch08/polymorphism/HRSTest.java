package com.ruby.java.ch08.polymorphism;

abstract class Employee extends Object { // 추상 클래스
	String name;
	int salary;
	public Employee() {
		super();
	} //자동으로 추가
	public abstract void calcSalary(); // 추상 메소드

	public void show() {
		System.out.println("name = " + name + "salary = " + salary);
	}
}

class Salesman extends Employee {
	int annual_sales; //employee의 멤버가 아니다
	public Salesman() { //자동으로 삽입
		super(); //자동으로 삽입
	}
	
	public void calcSalary() {
		System.out.println("세일즈맨 : " + salary);
	}
}

class Consultant extends Employee {
	int num_project;
	public void calcSalary() {
		System.out.println("컨설턴트");
	}
}

abstract class Manager extends Employee {
	int num_team;
	public void calcSalary() { // 추상 메소드를 구현
		System.out.println("매니저");
	}
}

class Director extends Manager {
	public void calcBonus() {
		System.out.println("이사");
	}
}

public class HRSTest {
	public static void calcTax(Employee e) { //Salesman
		if (e instanceof Salesman) {
			Salesman s = (Salesman) e; //type casting (이렇게 annual 에러 고치기)
			System.out.println(e + "는 세일즈맨 객체");
			System.out.println(s.annual_sales); //여기 에러안나려면 위에 employee를 salesman으로 수정
		}
		
		e.calcSalary();
		double tax = 0;
		if (e.getClass().getName() == "Diretor")
			tax = e.salary * 0.2;
		else
			tax = e.salary * 0.1;
		System.out.println("세일즈맨 세금 = " + tax); //이렇게하면 밑에 주석처리한거 안만들어도 됨
	}
/*
public class HRSTest {
	public static void calcTax(Director d) {
		double tax = 0;
		tax = s.salary * 0.1;
		System.out.println("세일즈맨 세금 = " + tax);
	}

public class HRSTest {
	public static void calcTax(Consultant c) {
		double tax = 0;
		tax = s.salary * 0.1;
		System.out.println("세일즈맨 세금 = " + tax);
	}
	*/
public static void main(String[] args) {
//	Employee e = new Employee();
//	Manager s2 = new Salesman();
	Salesman s = new Salesman();
	Employee e = new Salesman();
	Object o = new Salesman();
	Director d = new Director();
	Consultant c = new Consultant();
//	Manager m = new Manager(); //추상 클래스이므로 객체 생성 못함
	s.calcSalary();
	calcTax(s);
	calcTax(d);
	calcTax(c);
//	s.toString()
//	(if (s.equals(c)))
	}
}
