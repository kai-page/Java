/**
 * Lambda1.java
 * ラムダ式について
 * @author KAI
 */

import java.util.Arrays;
import java.util.List;

public class Lambda1 {
	public static void main(String[] args) {
		
		Integer[] array = {1, 2, 3, 4, 5};
		List<Integer> list = Arrays.asList(array);
		
		// ラムダ式での記述
		list.forEach(System.out::println);
		System.out.println();
		
		/*
		// for文での記述
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		*/
		
		// 偶数の表示
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
		System.out.println();
		
		/*
		// forとifで記述
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				System.out.println(list.get(i));
			}
		}
		*/
	}
}
