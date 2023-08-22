package com.ruby.java.ch07.추상;

public class MessengerTest {
	public static void main(String[] args) {
		IPhoneMessenger iphone = new IPhoneMessenger();
		iphone.setLogin(false); //static 아님, 객체가 있어야함
		iphone.getMessage();
		iphone.setMessage(null);
		Messenger.getConnection(); //static
//		iphone.getConnection();
	}
}
