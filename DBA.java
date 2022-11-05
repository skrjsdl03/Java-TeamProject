import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DBA {
	private Connection conn;
	private static String dburl= "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";;
	private static String dbUser= "testjju";
	private static String dbpw="1234";
	
	public DBA(){}
	public void selectData() {
		try {
			System.out.println("db로딩중");
			conn=DriverManager.getConnection(dburl, dbUser, dbpw);
		}catch(Exception e) {
			System.out.println("db로딩 실패");
		}
		String sql="Select * from user";
		try {
			PreparedStatement pstmt=conn.prepareStatement(sql);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		try {
			conn.close();
		}catch(SQLException e) {}
	}
	public void insertData(int id,String name, String depart, String rank, int halfway, int reward,int point) {
		try {
			System.out.println("db로딩중");
			conn=DriverManager.getConnection(dburl, dbUser, dbpw);
		}catch(Exception e) {
			System.out.println("db로딩 실패");
		}
		String sql="insert into user values(?,?,?,?,?,?,?)";
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, depart);
			pstmt.setString(4, rank);
			pstmt.setInt(5, halfway);
			pstmt.setInt(6, reward);
			pstmt.setInt(7, point);
			
			int result= pstmt.executeUpdate();
			if(result==1) {
				System.out.println("insert complete");
			}
		}catch(Exception e) {
			System.out.println("insert failed");
		}finally {
			try {
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			}catch (Exception e) {}
		}
		try {
			conn.close();
		}catch(SQLException e) {}
	}
	public void updateData(int id,String name, String depart, String rank, int halfway, int reward,int point) {
		try {
			System.out.println("db로딩중");
			conn=DriverManager.getConnection(dburl, dbUser, dbpw);
		}catch(Exception e) {
			System.out.println("db로딩 실패");
		}
		String sql="update user set 사원이름=?, 부서=?, 직급=?, 반차=?, 상벌점=?, 포인트=? where 사원번호=?";
		PreparedStatement pstmt=null;
		//폼에서 데이터 받아올 코드 작성
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, depart);
			pstmt.setString(3, rank);
			pstmt.setInt(4, halfway);
			pstmt.setInt(5, reward);
			pstmt.setInt(6, point);
			pstmt.setInt(7, id);
			
			int result= pstmt.executeUpdate();
			if(result==1) {
				System.out.println("update complete");
			}
		}catch(Exception e) {
			System.out.println("update failed");
		}finally {
			try {
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			}catch (Exception e) {}
		}
		try {
			conn.close();
		}catch(SQLException e) {}
	}
	public void deleteData(int id) {
		try {
			System.out.println("db로딩중");
			conn=DriverManager.getConnection(dburl, dbUser, dbpw);
		}catch(Exception e) {
			System.out.println("db로딩 실패");
		}
		String sql="delete from user where 사원번호=?";
		PreparedStatement pstmt=null;
		
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			int result= pstmt.executeUpdate();
			if(result==1) {
				System.out.println("delete complete");
			}
		}catch(Exception e) {
			System.out.println("delete failed");
		}finally {
			try {
				if(pstmt!=null && !pstmt.isClosed()) {
					pstmt.close();
				}
			}catch (Exception e) {}
		}
		try {
			conn.close();
		}catch(SQLException e) {}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DBA db= new DBA();
		boolean flag=true;
		while(flag) {
			int id,halfway,reword,point;
			String name,depart,rank;
			System.out.println("1.추가 2.수정 3. 삭제");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				sc.nextLine();
				System.out.print("사번 이름 부서 직급 반차 상벌점 포인트");
				String s=sc.nextLine();
				StringTokenizer st=new StringTokenizer(s," ");
				
				id=Integer.parseInt(st.nextToken());
				name=st.nextToken();
				depart=st.nextToken();
				rank=st.nextToken();
				halfway=Integer.parseInt(st.nextToken());
				reword=Integer.parseInt(st.nextToken());
				point=Integer.parseInt(st.nextToken());
				
				db.insertData(id,name,depart,rank,halfway,reword,point);
				break;
			case 2:
				sc.nextLine();
				System.out.print("사번 이름 부서 직급 반차 상벌점 포인트");
				
				String s1=sc.nextLine();
				StringTokenizer st1=new StringTokenizer(s1," ");
				
				id=Integer.parseInt(st1.nextToken());
				name=st1.nextToken();
				depart=st1.nextToken();
				rank=st1.nextToken();
				halfway=Integer.parseInt(st1.nextToken());
				reword=Integer.parseInt(st1.nextToken());
				point=Integer.parseInt(st1.nextToken());

				db.updateData(id,name,depart,rank,halfway,reword,point);
				break;
			case 3:
				sc.nextLine();
				System.out.print("사번 ");
				int n=sc.nextInt();
				db.deleteData(n);
				break;
			default :
				System.out.println("종료합니다.");
				flag=false;
				break;
			}
		}
	}
}
