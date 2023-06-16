/**
 * ArrayList1.java
 * ArrayListについて
 * @author KAI
 */

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		
		// String型のArrayListを作成
		ArrayList<String> list = new ArrayList<>();
		
		// 作成したリストに要素を追加
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		
		// リストを表示
		System.out.println("list = " + list);
		
		// リスト要素を順に出力
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
