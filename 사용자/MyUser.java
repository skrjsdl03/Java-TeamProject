import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyUser extends JFrame{
	public MyUser()
	{
		setTitle("이용자 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(255, 255, 255));
		ImageIcon img = new ImageIcon("C:\\Users\\이창건\\Documents\\20212950\\2학년\\JAVA\\LCG\\JavaTeamProject\\src\\Images\\tstaff.jpg");
		JLabel imageLabel = new JLabel(img, JLabel.CENTER);
		imageLabel.setBounds(30, 30, 150, 187);
		c.add(imageLabel);
		
		JLabel time = new JLabel("시간) 2022-11-14-07-56-출근시간");
		time.setFont(new Font("돋음", Font.BOLD, 20));
		time.setSize(350, 50);
		time.setLocation(200, 20);
		c.add(time);
		
		JLabel name = new JLabel("이름 | 김지은");
		name.setFont(new Font("돋음", Font.PLAIN, 20));
		name.setSize(133, 50);
		name.setLocation(200, 70);
		c.add(name);
		
		JLabel position = new JLabel("직급 | 인턴");
		position.setFont(new Font("돋음", Font.PLAIN, 20));
		position.setSize(100, 50);
		position.setLocation(200, 100);
		c.add(position);
		
		JLabel department = new JLabel("부서 | 개발자");
		department.setFont(new Font("돋음", Font.PLAIN, 20));
		department.setSize(133, 50);
		department.setLocation(200, 130);
		c.add(department);
		
		JLabel point = new JLabel("상벌점 | 0/0");
		point.setFont(new Font("돋음", Font.PLAIN, 20));
		point.setSize(150, 50);
		point.setLocation(200, 160);
		c.add(point);
		
		JButton store = new JButton("상점");
		store.setFont(new Font("돋음", Font.PLAIN, 18));
		store.setSize(100, 50);
		store.setLocation(350, 200);
		c.add(store);
		
		JButton inventory = new JButton("내 가방");
		inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyInventory();
			}
		});
		inventory.setFont(new Font("돋음", Font.PLAIN, 18));
		inventory.setSize(100, 50);
		inventory.setLocation(460, 200);
		c.add(inventory);
		
		setSize(600,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyUser();
	}

}