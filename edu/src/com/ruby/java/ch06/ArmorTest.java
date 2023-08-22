package com.ruby.java.ch06;

public class ArmorTest {
	
	static Armor suit4; //필드선언
	
	public static void test() {
		Armor suit4 = new Armor();
		suit4.setName("mark48");
		suit4.setHeight(240);
//		System.out.println(suit4.getName() + " : " + suit4.getHeight());
	}
	//중괄호를 벗어나면은 new로 선언한것은 나타나지 않음. 계속 나타나게 하려면 필드 선언해야함
	
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();

		suit1.setName("mark6");
		suit1.setHeight(180);
		
		suit2.setName("mark16");
		suit2.setHeight(220);
		
		suit3.setName("mark38");
		suit3.setHeight(200);
		
		test(); //test라고하는 메서드를 찾아감
		
		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());		
	}
}
