package teamproject;

import javax.swing.*;
import java.awt.*;


public class Login extends JFrame  {
	private JTextField textField;
	private JTextField textField_1;
	
	public  Login(String title, int xsize, int ysize, Boolean visible)   {
		getContentPane().setBackground(Color.GRAY);
		setTitle("xx회사 로그인 창");	// 화면 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container loginPane = getContentPane();
		
		// 폰트 지정 - PLAIN-기본, BOLD - 굵게, ITALIC - 기울임
		Font font = new Font("돋움", Font.BOLD, 50);
		
		loginPane.setLayout(null);
		JLabel test = new JLabel("XX회사");
		test.setLocation(210, 20);
		test.setSize(200, 200);
		test.setFont(font);
		loginPane.add(test);
		
		JLabel lblNewLabel = new JLabel(" 아이디(이름)");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(144, 180, 119, 40);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("패스워드(사원번호)");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(108, 230, 132, 40);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(261, 189, 183, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(261, 240, 183, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(468, 239, 91, 23);
		getContentPane().add(btnNewButton);
		
		
		setSize(596, 405);	// 화면 사이즈
		setVisible(visible);	// 
		
	}
	
	
	public static void main(String args[]) {
		
		// 로그인 화면
		Login login = new Login("로그인창", 500, 500, true);

		
		
	}
}
