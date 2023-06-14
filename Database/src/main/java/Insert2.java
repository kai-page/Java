/**
 * Insert2.java
 * DB(MySQL)へinsertするプログラム(PreparedStatementを使用)
 * @author KAI
 */

// JDBC関連のクラスやインターフェースをインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert2 {
	public static void main(String[] args) {
		
		// DB接続で必要な情報を定義
		final String URL = "jdbc:mysql://localhost/test";
		final String USER = "root";
		final String PASS = "";
		
		// 実行するSQL文
		String sql = "INSERT INTO users (name,age) VALUES (?, ?)";
		
		String[] userNames = {"AAA", "BBB", "CCC", "DDD"};
		int[] userAges = {20, 23, 30, 40, 21};
		
		
		// ConnectionとPreparedStatement変数の定義
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			// DBに接続
			con = DriverManager.getConnection(URL, USER, PASS);
			// ステートメントを生成
			ps = con.prepareStatement(sql);
			// SQLを実行
			for (int i = 0; i < userNames.length; i++) {
				ps.setString(1, userNames[i]);
				ps.setInt(2, userAges[i]);
				ps.executeUpdate();
			}
			System.out.println(userNames.length + "件更新しました");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// リソースの解放
				if (ps != null) ps.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
