/**
 * Loop2.java
 * 繰り返し処理(while文)について
 * @author KAI
 */

public class Loop2 {
	public static void main(String[] args) {
		
		// 1から10までの数字を表示
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int num = 10;
		do {
			System.out.println(num);
			num -= 3;
		} while (num > 0);
		
	}
}
