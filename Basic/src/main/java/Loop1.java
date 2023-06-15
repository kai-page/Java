/**
 * Loop1.java
 * 繰り返し処理(for文)について
 * @author KAI
 */

public class Loop1 {
	public static void main(String[] args) {
		
		// 1から10までの数字を表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 一次元配列の要素をfor文で表示
		int array[] = {10, 20, 30, 40, 50};
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
		
		// 二次元配列の要素をfor文で表示
		int array2[][] = { {100, 200, 300}, {400, 500} };
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j ++) {
				System.out.println(array2[i][j]);
			}
		}
		
	}
}
