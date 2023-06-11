/**
 * BaseDataType.java
 * データ型: 基本データ型について
 * @author KAI
 */

public class BaseDataType {
	public static void main(String[] args) {
		
		/*
		 * 基本データ型(変数にデータそのものが入る)
		 * 
		 * 整数
		 * byte (8bit, -128 ~ 127)
		 * short (16bit, -32,768～32,767)
		 * int (32bit, -2,147,483,648～2,147,483,647)
		 * long (64bit, -9,223,372,036,854,775,808～9,223,372,036,854,775,807)
		 * 
		 * 小数
		 * float (32bit, 単精度浮動小数点数)
		 * double (64bit, 倍精度浮動小数点数)
		 * 
		 * 文字
		 * char (16bit, 1文字(Unicode))
		 * 
		 * 論理型
		 * boolean (true or false)
		 * 
		 */
		
		// 整数型
		byte a = 100;
		short b = 1000;
		int c = 10;
		long d = 1L;
		
		// 小数型
		float e = 10.0f;
		double f = 100.0d;
		
		// 文字型
		char g = 'A';
		
		// 論理型
		boolean h = true;
		boolean i = false;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		System.out.println("i = " + i);
		
	}
}
