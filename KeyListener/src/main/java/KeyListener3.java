/**
 * KeyListener3.java
 * キーボード入力について
 * @author KAI
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyListener3 {
	public static void main(String[] args) {
		
		// キーボードから数値のみを受け取る
		Scanner scanner = new Scanner(System.in);
		System.out.println("数値を入力してください");
		
		try {
			int num = scanner.nextInt();
			System.out.println("入力した数値: " + num);
		} catch (InputMismatchException e) {
			System.out.println("数値以外が入力されました");
		}
		
	}
}
