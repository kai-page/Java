/**
 * Operator.java
 * 演算子について
 * @author KAI
 */

public class Operator {
	public static void main(String[] args) {
		
		int a = 13;
		int b = 2;
		
		System.out.println("a = " + a + ", b = " + b);
		
		// 算術演算子
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
		
		// 比較演算子
		System.out.println("a > b = " + (a > b));
		System.out.println("a < b = " + (a < b));
		
		System.out.println();
		
		// 代入演算子
		int c = 10;
		int d = 20;
		d = c + d;
		System.out.println("c = " + c + ", d = " + d);
		System.out.println("d = c + d = " + d);
		
		System.out.println();
		
		// インクリメント演算子
		int e = 10;
		System.out.println("e = " + e);
		e++;
		System.out.println("e++ = " + e);
		
		System.out.println();
		
		// デクリメント演算子
		int f = 10;
		System.out.println("f = " + f);
		f--;
		System.out.println("f-- = " + f);
		
	}
}
