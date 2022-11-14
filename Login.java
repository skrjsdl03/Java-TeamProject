import javax.swing.*;
import java.awt.*;


public class Login extends JFrame  {
	
	public  Login(String title, int xsize, int ysize, Boolean visible)   {
		setTitle(title);	// 화면 제목
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container loginPane = getContentPane();
		
		// 폰트 지정 - PLAIN-기본, BOLD - 굵게, ITALIC - 기울임
		Font font = new Font("돋움", Font.BOLD, 50);
		
		loginPane.setLayout(null);
//		JLabel test = new JLabel("XX회사");
//		test.setLocation(150, 50);
//		test.setSize(200, 200);
//		test.setFont(font);
//		loginPane.add(test);
//		
		
		setSize(xsize, ysize);	// 화면 사이즈
		setVisible(visible);	// 
		
	}
	
	
	public static void main(String args[]) {
		
		// 로그인 화면
		Login login = new Login("로그인창", 500, 500, true);

		
		
	}


}
