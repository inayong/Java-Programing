package com.ruby.java.ch08.innerClass;

class Node { //이렇게 밖으로 나오면 외부 클래스
	String data; //default 모드
	Node link;
	
	public Node(String data) {
		this.data = data;
	}
}
public class MyLinkedList {

	private Node head = null;
	
	private class Node { //내부 클래스 
		private String data;
		private Node link;
		
		public Node(String data) { 
			this.data = data;
		}
		
	}
	
	public MyLinkedList() {}

	public void add(String data) {//대단히 중요 > 자료구조
		Node nd = new Node(data); //새로운 노드 만들어서 
		if (head == null) {
			head = nd;
		} else {
			Node next = head;
			while(next.link != null) { //여기부터 3줄 매우 중요!!!!!!!!!!
				next = next.link;
			}
			next.link = nd;
		}
	}
	
	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while(next != null) {
				System.out.println(" " + next.data);
				next = next.link;
			}
		}
	}
		public void delete(String data) {

			if (head == null) {

				System.out.println("삭제할 데이터가 없습니다.");

			} else {

				Node p = head;

				Node q = p;
				while( p != null) {
					String s;
					s=p.data;
					if (s.compareTo(data) == 0)	{ 
						q.link = p.link;
						return;
					} else { 
						q=p;
						p=p.link;
						} // q는 p를 따라 다님
					}
				}

				//**** 구현할 부분

				System.out.println("삭제할 데이터가 없읍니다.");

				return;

			}
	}


