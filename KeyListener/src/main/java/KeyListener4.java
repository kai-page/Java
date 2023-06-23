/**
 * KeyListener4.java
 * キーボード入力について
 * @author KAI
 */

import java.util.Scanner;

public class KeyListener4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		
		while (!scanner.hasNextInt()) {
			System.out.println("数値を入力してください");
			scanner.next();
		}
		
		int num = scanner.nextInt();
		System.out.println("入力した数値: " + num);
		
	}
}
