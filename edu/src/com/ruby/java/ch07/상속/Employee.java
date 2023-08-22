package com.ruby.java.ch07.상속;

public class Employee extends Person {
//	private String name;
//	private int age;
	private String dept;
	public Employee() { // 객체 생성자
		System.out.println("Employee 생성자 호출");
//		super();
	}
	public Employee(String name, int age, String dept) {
		super(name, age); 
//		super.setName(name);//중복 코드 제거
//		super.setAge(age);//중복 코드 제거
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}
	public String toString() {
//		return getName() + " : " + getAge() + " : " + dept;
//		return name + " : " + age + " : " + dept;  //person에서 private String name & int age; 를 public으로 변경하면 오류 해결 근데 굳이xxxx
		return super.toString() + "dept = " + dept;
	}
	
	/*
	public String getName() {
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
	*/
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
}
