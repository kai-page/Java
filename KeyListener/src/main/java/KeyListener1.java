/**
 * KeyListener1.java
 * キーボード入力について
 * @author KAI
 */

import java.util.Scanner;

public class KeyListener1 {
	public static void main(String[] args) {
		
		// キーボードから入力された値を表示
		Scanner scanner = new Scanner(System.in);
		System.out.println("何か入力してください");
		String str = scanner.next();
		System.out.println("入力した文字: " + str);
		
	}
}
