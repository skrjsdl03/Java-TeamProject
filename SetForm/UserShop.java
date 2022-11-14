package SetForm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import SetForm.AdminShop.*;




public class UserShop extends JFrame{
	private int coin = 10;
	private JLabel coinLabel;
	
	public UserShop() {
		setTitle("상점");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container usershoppane = getContentPane();
		
		
		usershoppane.setLayout(null);
			
//		// 폰트 설정
//		Font font = new Font("돋움", Font.BOLD, 20);
		
		
		// 이미지
		// 휴가권 - 1
		ImageIcon vacationImage = new ImageIcon("C:\\Users\\wndud\\Desktop\\자바프로젝트\\src\\SetForm\\휴가권.jpg");
		
		// 반차 - 0.5
		ImageIcon halfvationimage = new ImageIcon("C:\\Users\\wndud\\Desktop\\자바프로젝트\\src\\SetForm\\휴가권.jpg");
		
		//랜덤박스
		ImageIcon randomboxImage = new ImageIcon("C:\\Users\\wndud\\Desktop\\자바프로젝트\\src\\SetForm\\선물상자1.jpg");
		
		// 타이틀 라벨 생성
		JLabel titleJLabel = new JLabel("사용자 - 상점");
		SetFont(titleJLabel, 30);
		titleJLabel.setBounds(400, 5, 200, 80);
		
		
		// 이미지 라벨 생성 & 이미지 적용 - setIcon
		JLabel randomboxLabel = new JLabel(randomboxImage, JLabel.CENTER);
		JLabel vacationLabel = new JLabel(vacationImage, JLabel.CENTER);
		JLabel halfvactionJLabel = new JLabel(halfvationimage, JLabel.CENTER);
		
		
		// 이미지 라벨 설정 setBounds(x, y, w, h) margin - 40
		vacationLabel.setBounds(90, 80, 200, 400);
		halfvactionJLabel.setBounds(320, 80, 200, 400);		
		randomboxLabel.setBounds(550, 80, 200, 400);
		
		// 물품 라벨 생성
		JLabel vanameLabel = new JLabel("상점 : 8점");
		JLabel halfnameLabel = new JLabel("상점 : 4점");
		JLabel rannameLabel = new JLabel("상점 : 1점");
		
		
		// 물품 라벨 설정
		vanameLabel.setBounds(130, 560, 100, 50);
		SetFont(vanameLabel, 20);
		
		halfnameLabel.setBounds(360, 560, 100, 50);
		SetFont(halfnameLabel, 20);
		
		rannameLabel.setBounds(595, 560, 100, 50);
		SetFont(rannameLabel, 20);
		
		
		// 상벌점 현황 라벨
		coinLabel = new JLabel("상/벌점 : " + coin);

		
		// 상벌점 라벨 설정
		coinLabel.setBounds(790, 100, 200,100);
		SetFont(coinLabel, 20);
		
		
		// 추가
		// 제목 라벨
		usershoppane.add(titleJLabel);
		
		// 이미지 라벨
		usershoppane.add(vacationLabel);
		usershoppane.add(halfvactionJLabel);
		usershoppane.add(randomboxLabel);
		
		// 물품 라벨
		usershoppane.add(vanameLabel);
		usershoppane.add(halfnameLabel);
		usershoppane.add(rannameLabel);
		
		// 상벌점 현황 라벨
		usershoppane.add(coinLabel);

		
		// 구매 버튼
		JButton vacationButton= new JButton("휴가 - 구매");
		JButton halfvacationButton = new JButton("반차 - 구매");
		JButton randomBoxButton = new JButton("뽑기 - 구매");
		
		
//		vacationButton.setContentAreaFilled(false); - 배경 유무
		// 구매 버튼 설정
		vacationButton.setBounds(110, 500, 150, 50);
		SetBack(vacationButton);
		vacationButton.setBorderPainted(false);
		vacationButton.setFocusPainted(false);
		
		halfvacationButton.setBounds(340, 500, 150, 50);
		SetBack(halfvacationButton);
		halfvacationButton.setBorderPainted(false);
		halfvacationButton.setFocusPainted(false);
		
		randomBoxButton.setBounds(575, 500, 150, 50);
		SetBack(randomBoxButton);
		randomBoxButton.setBorderPainted(false);
		randomBoxButton.setFocusPainted(false);
		
		
		// 구매 버튼 이벤트 설정
		ShowBuyMessage vacationBuyMessage = new ShowBuyMessage();
		vacationBuyMessage.SetPrice(8);
		vacationButton.addActionListener(vacationBuyMessage);
		
		ShowBuyMessage halfvacationBuyMessage = new ShowBuyMessage();
		halfvacationBuyMessage.SetPrice(4);
		halfvacationButton.addActionListener(halfvacationBuyMessage);
		
		ShowBuyMessage randomBuyMessage = new ShowBuyMessage();
		randomBuyMessage.SetPrice(1);
		randomBoxButton.addActionListener(randomBuyMessage);
		
		
		// 닫기(확인) 버튼 생성 & 설정 & 이벤트
		JButton closeButton = new JButton("닫기");
		SetBack(closeButton);
		SetFont(closeButton, 14);
//		closeButton.setForeground(Color.white); // 글자 색상
		closeButton.setBounds(880, 600, 80, 40);
		closeButton.addActionListener(new CloseFrame());

		
		// 상품 정보 확인 버튼 - 확률(1등 1%, 2등 3%, 3등 4%), 각 등수 상품
		JButton itemsinfoButton = new JButton("상품 확인");
		SetFont(itemsinfoButton, 20);
		itemsinfoButton.setContentAreaFilled(false);
		itemsinfoButton.setBorderPainted(false);
		itemsinfoButton.setFocusPainted(false);
		itemsinfoButton.setBounds(750, 500, 150, 50);
		itemsinfoButton.addActionListener(new ShowItemsInfo());
		
		

		// 추가
		// 구매 버튼
		usershoppane.add(vacationButton);
		usershoppane.add(halfvacationButton);
		usershoppane.add(randomBoxButton);
		
		// 닫기 버튼
		usershoppane.add(closeButton);
		
		// 상품 정보 확인 버튼
		usershoppane.add(itemsinfoButton);
		
		
		// 폰트설정
		SetFont(vacationButton, 20);
		SetFont(halfvacationButton, 20);
		SetFont(randomBoxButton, 20);
		
		
		// 창 사이즈 및 보임 여부
		setSize(1000, 700);
		setVisible(true);
		
		// 창이 가운데 나오게 함.
		setLocationRelativeTo(null);
		
		// 창 크기 변환x
		setResizable(false);
		
		
		
	}
	
//			JOptionPane.showMessageDialog(null, "버튼 클릭 됨", "메시지 박스");
//			JOptionPane.showMessageDialog(null, "버튼 클릭 됨", "메시지 박스", JOptionPane.WARNING_MESSAGE);	// 경고
//			JOptionPane.showMessageDialog(null, "버튼 클릭 됨", "메시지 박스", JOptionPane.ERROR_MESSAGE);		// 에러
//			JOptionPane.showMessageDialog(null, "버튼 클릭 됨", "메시지 박스", JOptionPane.INFORMATION_MESSAGE);	// 정보
//			JOptionPane.showMessageDialog(null, "버튼 클릭 됨", "메시지 박스", JOptionPane.QUESTION_MESSAGE);
	// 상점 - 메시지 박스 이벤트 처리
	class ShowBuyMessage implements ActionListener {
		int price;
		public void SetPrice(int price) {
			this.price = price;
			
		}
		// 
		@Override
		public void actionPerformed(ActionEvent e) {
			int buy = JOptionPane.showConfirmDialog(null, "버튼 클릭 됨", "메시지 박스", JOptionPane.YES_NO_OPTION);
			// 구매
			if (buy == JOptionPane.YES_OPTION) { 
				if (coin < price) {
					JOptionPane.showMessageDialog(null, "보유 상점이 부족합니다.", "구매 실패", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					coin -= price;
					JOptionPane.showMessageDialog(null, "구매되었습니다. \n현재 보유 코인 : " + coin, "구매 성공", JOptionPane.INFORMATION_MESSAGE);
					coinLabel.setText("상/벌점 : " + coin);
				}
				
			}

		}
	}
	
	// 닫기 - 이벤트 처리
	class CloseFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
//			System.exit(0);
			
		}
		
	}
	
	class ShowItemsInfo implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "상품 확인 \n1등 : " + AdminShop.firitem + ", 2등 : " + AdminShop.secitem + ", 3등 : " + AdminShop.thritem, "상품 정보 확인", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	

	// 폰트 설정
	public void SetFont(JButton button, int size) {
		Font font = new Font("돋움", Font.BOLD, size);
		button.setFont(font);
	}
	
	public void SetFont(JLabel label, int size) {
		Font font = new Font("궁서", Font.BOLD, size);
		label.setFont(font);
	}

	// 버튼 설정 - 기본
	public void SetBack(JButton button) {
		button.setBackground(Color.black);
		button.setForeground(Color.white);
	}
	
	
	public void SetLocation() {
		
	}

	
	
	
	
	
	public static void main(String[] args) {
		AdminShop adShop = new AdminShop();
		UserShop ushop = new UserShop();

		
	}

}
