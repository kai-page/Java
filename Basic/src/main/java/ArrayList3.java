/**
 * ArrayList3.java
 * 配列をList型に変換するプログラム
 * @author KAI
 */

import java.util.Arrays;
import java.util.List;

public class ArrayList3 {
	public static void main(String[] args) {
		
		// 配列の生成
		String[] array = {"AAA", "BBB", "CCC"};
		System.out.println("配列の中身");
		for (String str : array) {
			System.out.println(str);
		}
		
		// 配列をList型に変換
		List<String> list = Arrays.asList(array);
		System.out.println("リストの中身");
		System.out.println(list);
		
		/*
		 * 変換したListは追加や削除ができない
		 * list.add
		 * list.remove
		 * list.clear
		 * など 
		 */

	}
}
