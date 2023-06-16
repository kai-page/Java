/**
 * ArrayList2.java
 * ArrayListについて
 * @author KAI
 */

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
	public static void main(String[] args) {
		
		// String型のArrayListの作成と要素をセット
		ArrayList<String> list = new ArrayList<>(Arrays.asList("AAA", "BBB", "CCC"));
		
		// 要素を検索し真偽値を返す
		System.out.println(list.contains("AAA")); // true(存在する)
		System.out.println(list.contains("DDD")); // false(存在しない)
		
		// 要素を検索し位置を返す
		System.out.println(list.indexOf("CCC")); // 2
		System.out.println(list.indexOf("ABC")); // -1(存在しない)
		
		// 要素数を取得
		System.out.println(list.size()); // 3
		
		// 要素を追加
		System.out.println("要素追加前: " + list);
		list.add("DDD");
		System.out.println("要素追加後: " + list);
		
		// 指定の位置に要素を追加
		System.out.println("要素追加前: " + list);
		list.add(0, "QQQ");
		System.out.println("要素追加後: " + list);
		
		// 指定位置の要素を置き換え
		System.out.println("要素置き換え前: " + list);
		list.set(0, "ZZZ"); // 0番目のデータ(QQQ)をZZZへ置き換える
		System.out.println("要素置き換え後: " + list);
		
		// 指定の位置の要素を削除
		System.out.println("要素削除前: " + list);
		list.remove(2); // 2番目のデータ(BBB)を削除
		System.out.println("要素削除後: " + list);
		
		// 中身が空か
		System.out.println(list.isEmpty()); // false(中身あり)
		list.clear(); // すべての要素を削除
		System.out.println(list.isEmpty()); // true(中身なし)
		
	}
}
