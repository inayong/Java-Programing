package com.ruby.java.ch10;

import java.util.Iterator;
import java.util.LinkedList;

public class Test05 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("부산");
		list.add("대구");
		list.add("제주");
		
		for(int i = 0; i < list.size(); i++ ) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.remove(2);
//		list.remove(list)
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " > ");			
		}
		//정렬하는 코딩
		list.sort(null);
		System.out.println();
		Iterator<String> iter2 = list.iterator();
		while(iter2.hasNext()) {
			System.out.print(iter2.next() + " > ");			
		}
	}
}
