/**
 * TwoDimensionalArray.java
 * 二次元配列について
 * @author KAI
 */

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		// 二次元配列を宣言(2行3列)
		int[][] array = new int[2][3];
		
		// 配列に値を代入
		array[0][0] = 10;
		array[0][1] = 20;
		array[0][2] = 30;
		array[1][0] = 40;
		array[1][1] = 50;
		array[1][2] = 60;
		
		// 配列の宣言と初期化
		// int[][] array = { {10, 20, 30}, {40, 50, 60} };
		
		// 配列の要素を出力
		System.out.println("array[0][0] = " + array[0][0]);
		System.out.println("array[0][1] = " + array[0][1]);
		System.out.println("array[0][2] = " + array[0][2]);
		System.out.println("array[1][0] = " + array[1][0]);
		System.out.println("array[1][1] = " + array[1][1]);
		System.out.println("array[1][2] = " + array[1][2]);
		
		// 配列の要素数を出力
		System.out.println("array.length = " + array.length);
		System.out.println("array[0].length = " + array[0].length);
		
	}
}
