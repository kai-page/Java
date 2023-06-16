import java.util.HashMap;
import java.util.Map;

/**
 * Map2.java
 * Mapについて
 * @author KAI
 */

public class Map2 {
	public static void main(String[] args) {
		
		// Mapの生成と要素を追加
		Map<Integer,String> color = new HashMap<>();
		// color.put(キー, 値);
		color.put(1, "red");
		color.put(2, "black");
		color.put(3, "white");
		
		// 要素数を取得
		System.out.println(color.size()); // 3
		
		// キーを指定して上書き
		System.out.println("置き換え前: " + color);
		color.put(3, "yellow");
		System.out.println("置き換え後: " + color);
		
		// 要素を削除
		System.out.println("削除前: " + color);
		color.remove(3);
		System.out.println("削除後: " + color);
		
		
		// 中身が空か
		System.out.println(color.isEmpty()); // false(中身あり)
		// すべての要素を削除
		color.clear();
		System.out.println(color.isEmpty()); // true(中身が空)
		
	}
}
