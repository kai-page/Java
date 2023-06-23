/**
 * KeyListener5.java
 * キーボード入力について
 * @author KAI
 */

import java.util.Scanner;

public class KeyListener5 {
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		
		while (true) {
			String str = scanner.nextLine();			
			try {
				int num = Integer.parseInt(str);
				System.out.println("入力した数値: " + num);
				break;
			} catch (NumberFormatException e) {
				System.out.println("数値を入力してください");
			}
		}
		
	}
}
