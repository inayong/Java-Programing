package com.ruby.java.test1;

import com.ruby.java.test1.*;
import java.util.List;
import java.io.*;

public class Armor {
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	public void setHeight(int value) {
		height = value;
		weight = takeOff();
	}
	int takeOff() {
		System.out.println("엔진 구동");
		System.out.println("속도 고출력");
		System.out.println("비행");
		return 10;
//		System.out.println("재비행");
	}
}
