/**
 * KeyListener2.java
 * キーボード入力について
 * @author KAI
 */

import java.util.Scanner;

public class KeyListener2 {
	public static void main(String[] args) {
		
		// キーボードから複数入力をする場合
		Scanner scanner = new Scanner(System.in);
		System.out.println("何か入力してください");
				
		while (scanner.hasNext()) {
			String str = scanner.next();
			System.out.println("入力した文字: " + str);
		}
		
		System.out.println("入力終了");
		
	}
}
