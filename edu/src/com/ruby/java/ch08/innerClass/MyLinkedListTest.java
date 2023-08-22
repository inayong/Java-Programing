package com.ruby.java.ch08.innerClass;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
//		myList.head //mylinkedlist에서 head부분을 public으로 수정하면 사용가능 private은 사용x
		myList.print();

		myList.add("11");
		myList.add("55");
		myList.add("77");
		myList.add("177");
		myList.add("33");
		myList.print();
		myList.delete("177");
		System.out.println("삭제후 출력: ");
		myList.print();
		//MyLinkedList.Node nd = myList.new Node("Hong");//not visible
		//nd.data = "hello";
	}
}