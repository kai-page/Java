/**
 * Insert.java
 * DB(MySQL)へinsertするプログラム
 * @author KAI
 */

// JDBC関連のクラスやインターフェースをインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		
		// DB接続で必要な情報を定義
		final String URL = "jdbc:mysql://localhost/test";
		final String USER = "root";
		final String PASS = "";
		
		// 実行するSQL文
		String sql = "INSERT INTO users (name,age) VALUES ('AAA',20)";
		
		// ConnectionとStatement変数の定義
		Connection con = null;
		Statement stmt = null;
		
		try {
			// DBに接続
			con = DriverManager.getConnection(URL, USER, PASS);
			// ステートメントを生成
			stmt = con.createStatement();
			// SQLを実行
			int count = stmt.executeUpdate(sql);
			System.out.println(count + "件更新しました");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// リソースの解放
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
