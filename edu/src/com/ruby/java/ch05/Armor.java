package com.ruby.java.ch05;

//private class Student {
//	int age;
//	String name;
//}

public class Armor {
//	void test(int ... v) {
	void test(String name, int ...v) {
		System.out.println(v.length);
	}
	public void speedup(double value) {
		test("hong",10);
		test("kim",1,2,3,4,5);
		double speed = value;
	}
	public void speedup(int value, int maxValue) {
		int speed = value;
		int maxSpeed = maxValue;
	}
	
	void takeOff() {
		speedup(10); //첫째
		speedup(10,20); //둘째
//		System.out.println("이륙" + age);  // private가 클래스로 제한되므로 여기서는 에러 , 클래스 밖이니까
	}
	int land() {
		return 10;
	}
	void shootLaser() {}
	void launchMissile() {} 

}
