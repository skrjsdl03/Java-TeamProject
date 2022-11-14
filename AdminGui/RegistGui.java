package test;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

class ImagePanel extends JPanel {
    Image image;
    Toolkit toolkit = getToolkit();

    void setPath(String path) {
        image = toolkit.getImage(path); //이미지 경로 저장
    }

    public void paint(Graphics g) { //이미지 불러오기
        g.clearRect(0, 0, getWidth(), getHeight());
        if (image != null)
            g.drawImage(image, 0, 0, this);
    }
}

public class RegistGui {

    private JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegistGui window = new RegistGui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public RegistGui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 857, 486);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);


        JButton btnNewButton = new JButton("등록");
        btnNewButton.setBounds(716, 380, 98, 30);
        frame.getContentPane().add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(315, 66, 499, 30);
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(315, 126, 499, 30);
        frame.getContentPane().add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(315, 179, 499, 30);
        frame.getContentPane().add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(315, 235, 499, 30);
        frame.getContentPane().add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(315, 298, 499, 30);
        frame.getContentPane().add(textField_4);

        JLabel lblNewLabel = new JLabel("이름");
        lblNewLabel.setBounds(284, 73, 50, 15);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("");
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon(this.getClass().getResource("/employee.jpg")); //이미지 파일명
        lblNewLabel_1.setIcon(icon);
        lblNewLabel_1.setBounds(69, 113, 164, 161); //이미지 크기
        frame.getContentPane().add(lblNewLabel_1); //이미지 출력

        JLabel lblNewLabel_2 = new JLabel("직급");
        lblNewLabel_2.setBounds(284, 186, 50, 15);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("사원번호");
        lblNewLabel_3.setBounds(262, 242, 50, 15);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("상/벌점");
        lblNewLabel_4.setBounds(272, 305, 50, 15);
        frame.getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("관리자");
        lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_5.setForeground(new Color(0, 0, 255));
        lblNewLabel_5.setFont(new Font("굴림", Font.ITALIC, 31));
        lblNewLabel_5.setBounds(377, 10, 138, 82);
        frame.getContentPane().add(lblNewLabel_5);

        JButton btnNewButton_1 = new JButton("사진 선택");
        btnNewButton_1.setBounds(79, 293, 121, 39);
        frame.getContentPane().add(btnNewButton_1);

        JLabel lblNewLabel_7 = new JLabel("부서");
        lblNewLabel_7.setBounds(284, 133, 50, 15);
        frame.getContentPane().add(lblNewLabel_7);

        Container contentPane = frame.getContentPane();

        frame.setLocation(100, 100);
        frame.setPreferredSize(new Dimension(857, 486));

        FileDialog image = new FileDialog(frame, "사진 선택", FileDialog.LOAD); //이미지 파일 읽기

        ImagePanel imagePanel = new ImagePanel();
        contentPane.add(imagePanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        JTextField text = new JTextField(30);
        controlPanel.add(text);
        contentPane.add(controlPanel, BorderLayout.SOUTH);

        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setBounds(69, 113, 164, 161);
        frame.getContentPane().add(lblNewLabel_6);

        btnNewButton_1.addActionListener(e -> {  //버튼을 클릭했을때 이미지 디렉토리 경로와 파일이름 가져오기
            image.setVisible(true);
            if (image.getFile() != null) {
                ImageIcon imageIcon = new ImageIcon(image.getDirectory() + image.getFile());
                lblNewLabel_1.setIcon(new ImageIcon(imageIcon.getImage().getScaledInstance(156, 161, Image.SCALE_SMOOTH)));//사진을 크기에 맞춰서 출력
            }
            imagePanel.repaint(); //repaint 메소드 호출
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
