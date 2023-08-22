package com.ruby.java.ch08.polymorphism;
//polymorphism 실습 예제 코드

abstract class Vehicle {
	String engineType;
	int numberWheels;
	public Vehicle(String engineType, int numberWheels) {
		this.engineType = engineType;
		this.numberWheels = numberWheels;
	}
	public abstract void displayWheels();
	
//	public void show() {
//		System.out.println("type : " + engineType + "Wnum : " + numberWheels);
//	}
}

class Truck extends Vehicle {
	int weight;
	public Truck(String engineType, int numberWheels, int weight) {
		super(engineType, numberWheels);
		this.weight = weight;
	}
	public void displayWheels() {
		System.out.println("엔진 = " + engineType + ", 바퀴 = " + numberWheels + ", 무게 = " + weight);
	}
}

class Car extends Vehicle {
	int vehicleOccupants;
	public Car(String engineType, int numberWheels, int vehicleOccupants) {
		super(engineType, numberWheels);
		this.vehicleOccupants= vehicleOccupants;
	}
	public void displayWheels() {
		System.out.println("엔진 = " + engineType + ", 바퀴 = " + numberWheels + ", 사용자 = " + vehicleOccupants);
	}
}

class MotorCycle extends Vehicle {
	int price;
	public MotorCycle(String engineType, int numberWheels, int price) {
		super(engineType, numberWheels);
		this.price = price;
	}
	public void displayWheels() {
		System.out.println("엔진 = " + engineType + ", 바퀴 = " + numberWheels + ", 가격 = " + price);
	}
}

public class ch08_test_polymorphism실습 {
	public static void checkWheels(Vehicle [] a) {
//		a.displayWheels();
		for (Vehicle v : a) {
			v.displayWheels();
		}
	}
public static void main(String[] args) {
	Vehicle [] arr = new Vehicle[5];
	arr[0] = new Truck("T", 33, 300);
	arr[1] = new Car("C", 55, 100);
	arr[2] = new MotorCycle("M", 66, 5000);
	arr[3] = new Car("C", 56, 200);
	arr[4] = new MotorCycle("M", 67, 5500);

	checkWheels(arr);
}
}
