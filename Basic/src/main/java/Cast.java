/**
 * Cast.java
 * 基本データ型の型変換について
 * @author KAI
 */

public class Cast {
	public static void main(String[] args) {
		
		/*
		 * 表現できる値の幅が、小　→　大　の場合は自動で型変換が行われる
		 * 表現できる値の幅が、大　→　小　の場合はキャストする必要がある
		 * 
		 * 小　→　大
		 * byte short int long float double
		 */
		
		// int型からdouble型へ
		int intValue1 = 100;
		double doubleValue1 = intValue1;
		System.out.println(doubleValue1);
		
		// double型からint型へ
		double doubleValue2 = 100.0;
		int intValue2 = (int)doubleValue2;
		System.out.println(intValue2);
				
	}
}
