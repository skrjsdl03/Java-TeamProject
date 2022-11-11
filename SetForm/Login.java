package SetForm;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
	public  Login(String title, int xsize, int ysize, Boolean visible)   {
		setTitle(title);	// 화면 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container loginPane = getContentPane();
		// 배경 색
		loginPane.setBackground(Color.lightGray);
		
		// 폰트 지정 - PLAIN-기본, BOLD - 굵게, ITALIC - 기울임
		Font company = new Font("돋움", Font.BOLD, 50);
		
		// 레이아웃 설정
		loginPane.setLayout(null);
		
		// 라벨 생성 
		JLabel test = new JLabel("XX회사");
		test.setLocation(250, 50);
		test.setSize(400, 100);
		test.setFont(company);
		loginPane.add(test);
		
		// 텍스트필드 - 아이디
		JTextField idField = new JTextField("아이디");
		idField.setLocation(250, 150);
		idField.setSize(200, 40);
		loginPane.add(idField);
		
		// 텍스트필드 - 비밀번호
		JTextField pwField = new JTextField("비밀번호");
		pwField.setLocation(250, 200);
		pwField.setSize(200, 40);
		loginPane.add(pwField);
		
		// 로그인 버튼
		JButton logintButton = new JButton("로그인");
		logintButton.setBackground(Color.white);
		logintButton.setLocation(460, 175);
		logintButton.setSize(80, 40);
		loginPane.add(logintButton);
		
		
		setSize(xsize, ysize);	// 화면 사이즈
		setResizable(false);	// 화면 크기 변경 불가능
		setVisible(visible);	// 
		
	}
	
	
	public static void main(String args[]) {
		
		// 로그인 화면
		Login login = new Login("로그인창", 700, 400, true);

		
		
	}


}
