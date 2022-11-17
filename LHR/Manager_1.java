package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Manager_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_1 frame = new Manager_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Manager_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("검색\r\n");
		lblNewLabel.setBounds(43, 38, 50, 15);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("상점");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminShop As=new AdminShop();	
				As.setVisible(true);
				As.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setBounds(522, 34, 91, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("수정"); //수정버튼 생성
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyGui Md=new ModifyGui();	
				Md.setVisible(true); //버튼1 클릭시 ModifyGui 출력
				Md.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //ModifyGui 창 만 닫기
			}
		});
		btnNewButton_1.setBounds(522, 164, 91, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("삭제"); //삭제버튼 생성
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_2) {
	      			JOptionPane.showMessageDialog(null,"삭제되었습니다");   //버튼2 클릭시 "삭제되었습니다" 메세지창 출력
	      		}
			}
		});
		btnNewButton_2.setBounds(522, 235, 91, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("등록"); //등록버튼 생성
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistGui Rg=new RegistGui();
				Rg.setVisible(true); //버튼3 클릭시 RegistGui 출력
				Rg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //RegistGui 창 만 닫기
			}
		});
		btnNewButton_3.setBounds(522, 309, 91, 23);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setBounds(85, 35, 313, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 105, 441, 274);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uC774\uB984", "\uBD80\uC11C", "\uC9C1\uAE09", "\uC0AC\uC6D0 \uBC88\uD638", "\uC0C1/\uBC8C\uC810"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_4 = new JButton("상세보기");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				details dt=new details();
				dt.setVisible(true); //버튼4 클릭시 RegistGui 출력
				dt.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //RegistGui 창 만 닫기
			}
		});
		btnNewButton_4.setBounds(516, 108, 97, 23);
		contentPane.add(btnNewButton_4);
	}
}
