package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Dto.AoQ;

public class AoQDao {
	//生徒一覧
	public static ArrayList<AoQ> AllSt(){
		ArrayList<AoQ> reList = new ArrayList<AoQ>();

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/qualifications?useSSL=false",
					"root",
					"yhsrntk1115"
					);

			String sql = "SELECT * FROM students";

			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next() == true){
				int sId = rs.getInt("stID");
				int gra = rs.getInt("grade");
				int cla = rs.getInt("sclass");
				String cha = rs.getString("name");
				reList.add(new AoQ(sId,gra,cla,cha));
			}

		} catch (SQLException | ClassNotFoundException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return reList;
	}
	//生徒追加
	public static ArrayList<AoQ> insertSt(int idKey,int grKey,int clKey,String naKey){
		ArrayList<AoQ> reList = new ArrayList<AoQ>();

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/qualifications?useSSL=false",
					"root",
					"yhsrntk1115"
					);

			String sql = "insert into students (stID,grade,sclass,name) values (?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,idKey);
			pstmt.setInt(2,grKey);
			pstmt.setInt(3,clKey);
			pstmt.setString(4,naKey);

			pstmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return reList;
	}

	//資格追加
	public static ArrayList<AoQ> insertQo(int idKey,String qoKey,Date exKey,Boolean sofKey){
		ArrayList<AoQ> reList = new ArrayList<AoQ>();

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/qualifications?useSSL=false",
					"root",
					"yhsrntk1115"
					);

			String sql = "insert into quali (stID,quaname,examination,sof) values (?,?,?,?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,idKey);
			pstmt.setString(2,qoKey);
			pstmt.setDate(3,exKey);
			pstmt.setBoolean(4,sofKey);

			pstmt.executeUpdate();

		} catch (SQLException | ClassNotFoundException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return reList;
	}
	//一覧表示
	public static ArrayList<AoQ> AllList(){
		ArrayList<AoQ> reList = new ArrayList<AoQ>();

		//変数の初期化
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/qualifications?useSSL=false",
					"root",
					"yhsrntk1115"
					);
			String sql =  "select students.name,quali.stID,quali.quaname,quali.examination,quali.sof from students "
						+ "inner join quali "
						+ "where students.stID = quali.stID";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			while(rs.next() == true){
				int Sid = rs.getInt("stID");
				String nam = rs.getString("name");
				String qna = rs.getString("quaname");
				Date exa = rs.getDate("examination");
				boolean so = rs.getBoolean("sof");
				reList.add(new AoQ(Sid,nam,qna,exa,so));
			}
		} catch (SQLException | ClassNotFoundException e){
			System.out.println("DBアクセスに失敗しました。");
			e.printStackTrace();
		} finally {
			try {
				if( rs != null){
					rs.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
			try {
				if( pstmt != null){
					pstmt.close();
				}
			} catch(SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}

			try {
				if( con != null){
					con.close();
				}
			} catch (SQLException e){
				System.out.println("DB切断時にエラーが発生しました。");
				e.printStackTrace();
			}
		}

		return reList;
	}
}
