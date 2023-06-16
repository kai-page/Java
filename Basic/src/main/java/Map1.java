import java.util.HashMap;
import java.util.Map;

/**
 * Map1.java
 * Mapについて
 * @author KAI
 */

public class Map1 {
	public static void main(String[] args) {
		
		// Mapの生成と要素を追加
		Map<Integer,String> color = new HashMap<>();
		// color.put(キー, 値);
		color.put(1, "red");
		color.put(2, "black");
		color.put(3, "white");
		
		// 要素を取得
		System.out.println(color); // {1=red, 2=black, 3=white}
		System.out.println(color.get(1)); // red
		System.out.println(color.get(2)); // black
		System.out.println(color.get(3)); // white
		System.out.println(color.get(4)); // null
		
		// for文でキーと値を取得
		for (Map.Entry<Integer, String> cl : color.entrySet()) {
			System.out.println(cl.getKey());
			System.out.println(cl.getValue());
		}
		
		// for文でキーを取得
		for (Integer cl : color.keySet()) {
			System.out.println(cl);
		}
		
		// for文で要素を取得
		for (String cl : color.values()) {
			System.out.println(cl);
		}
		
		// ラムダ式で表示
		color.forEach((a, b) -> System.out.println("キー = " + a + ", 値 = " + b));
		
		
	}
}
