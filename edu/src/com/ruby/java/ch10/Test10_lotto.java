package com.ruby.java.ch10;

//hashset을 arraylist로 변환하여 정렬하기 구현

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.List;

class ListComparator implements Comparator<List<Integer>> {
	@Override
	public int compare(List<Integer> l1, List<Integer> l2) {
		Iterator<Integer> ait = l1.iterator();
		Iterator<Integer> bit = l1.iterator();
		while (ait.hasNext()) {
			int anum = ait.next();
			int bnum = bit.next();
			if (anum > bnum)
				return 1;
			else if (anum < bnum)
				return -1;

		}
		return 0;
	}
}

public class Test10_lotto {

	public static void main(String[] args) {

		lotto_generator(10000);

	}

	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<HashSet<Integer>> lot = new HashSet<>();
		HashSet<Integer> lotto = null;
		List<List<Integer>> al = new ArrayList<>();
		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();

			for (int j = 0; lotto.size() < 7; j++) {// 6개 번호와 보너스 번호
				lotto.add(number.nextInt(46));
			}
			lot.add(lotto);
			List<Integer> L = new ArrayList<>(lotto);

			Collections.sort(L);
//			System.out.println(L);
			al.add(L);
		}
		System.out.println("lot = " + al);

//		Collections.sort((List<Integer>) al);
		al.sort(new ListComparator());
		// System.out.println("lot = " + al);
		// hashset의 리스트를 정렬하는 알고리즘 개발
		// hashset를 arrayList로 변환
		// 당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		for (int j = 0; win.size() < 7; j++) {// 6개 번호와 보너스 번호
			win.add(number.nextInt(46));
		}
		List<Integer> winlist = new ArrayList<>(win);
		System.out.print("당첨번호: " + winlist);// 6개의 당첨번호와 보너스번호
		// 6개를 맞힌 복권을 찾는다
		System.out.println();
		winnerLotto(winlist, al);// 1등을 찾는다

	}

	// 번호체크 리스트꺼내기
	static void winnerLotto(List<Integer> w, List<List<Integer>> al) {
		for (int i = 0; i < al.size(); i++) {
			List<Integer> elem = al.get(i);
			checkWinner(w, elem);
		}
	}

	static void checkWinner(List<Integer> w, List<Integer> elem) {

		int count = 0;
		List<Integer> L = new ArrayList<>(w);
		for (int i = 0; i < L.size() - 1; i++) {
				if (elem.contains(L.get(i))) {
					count++;
				}
			
		}
		//System.out.println("count = " + count);
			switch (count) {
			case 0:
			case 1:
			case 2:
//				System.out.println("꽝");
				break;
			case 3:
//				System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
				break;
			case 4:
//				System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
				break;
			case 5:
				if (L.get(6).equals(elem.get(6))) {
					System.out.println("2등 복권 " + elem + " 당첨번호:" + w);
					break;
				} else {
					System.out.println("3등 복권 " + elem + " 당첨번호:" + w);
					break;
				}

			case 6:
				System.out.println("1등 복권 " + elem + " 당첨번호:" + w);
				break;
			}

		}
	}

