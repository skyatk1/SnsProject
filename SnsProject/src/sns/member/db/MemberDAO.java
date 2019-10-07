package sns.member.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
	Connection con = null;
	String sql = "";
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private Connection getCon() throws Exception{
		Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/SnsProject");
		con = ds.getConnection();
	
		return con;
	}
	
	private void closeDB(){
		try{
			if(rs != null){ rs.close(); }
			if(pstmt != null){ pstmt.close(); }
			if(con != null){ con.close(); }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	// 이메일 중복확인
	public int emailCheck(String email) {
		int check = 0;
		
		try {
			con = getCon();
			
			sql = "select * from member where email=?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, email);
			
			rs = pstmt.executeQuery();
			
			// 저장된 이메일 값이 있을 경우 check = 1
			if (rs.next()) {
				check = 1;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return check;
	}
	
	// 회원정보 DB 저장
	public void insertMember(MemberDTO mdto) {
		int m_num = 0;
		
		try {
			con = getCon();
			
			sql = "select max(m_num) from member";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				m_num = rs.getInt(1) + 1;
			}
			
			sql = "insert into member values (?, ?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, mdto.getEmail());
			pstmt.setInt(2, m_num);
			pstmt.setString(3, mdto.getPassword());
			pstmt.setString(4, mdto.getFirstName());
			pstmt.setString(5, mdto.getLastName());
			pstmt.setString(6, mdto.getGender());
			pstmt.setInt(7, 0);
			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
	}
}
