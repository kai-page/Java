/**
 * Select.java
 * DB(MySQL)から情報を取得するプログラム
 * @author KAI
 */

// JDBC関連のクラスやインターフェースをインポート
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
	public static void main(String[] args) {
		
		// DB接続で必要な情報を定義
		final String URL = "jdbc:mysql://localhost/test";
		final String USER = "root";
		final String PASS = "";
		
		// 実行するSQL文
		String sql = "SELECT * FROM users";
		
		// Connection, Statement, ResultSet変数の定義
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// DBに接続
			con = DriverManager.getConnection(URL, USER, PASS);
			// ステートメントを生成
			stmt = con.createStatement();
			// SQLを実行
			rs = stmt.executeQuery(sql);
			// 検索結果の処理
			while (rs.next()) {
				System.out.print("id = " + rs.getInt("id") + ", ");
				System.out.print("name = " + rs.getString("name") + ", ");
				System.out.println("age = " + rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// リソースの解放
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
