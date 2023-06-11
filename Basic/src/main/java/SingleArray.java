/**
 * SingleArray.java
 * 一次元配列について
 * @author KAI
 */

public class SingleArray {
	public static void main(String[] args) {
		
		// 一次元配列の宣言
		int[] array = new int[3];
		
		// 配列に値を代入
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		// 配列の宣言と初期化
		// int[] array = {10, 20, 30};
		
		// 配列の要素を出力
		System.out.println("array[0] = " + array[0]);
		System.out.println("array[1] = " + array[1]);
		System.out.println("array[2] = " + array[2]);
		
		// 配列の要素数を出力
		System.out.println("array配列の要素数: " + array.length);
		
	}
}
