package exam;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class MyFrame extends JFrame {
	

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MyFrame() {
		
		setTitle("덕성여대 화이팅");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 237);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setBounds(36, 45, 151, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("학번");
		lblNewLabel_1.setBounds(36, 70, 151, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("성적");
		lblNewLabel_2.setBounds(36, 95, 113, 15);
		contentPane.add(lblNewLabel_2);
				
		
		JLabel lblNewLabel_4 = new JLabel("학생 등록하기");
		lblNewLabel_4.setFont(new Font(" ",Font.PLAIN, 16));
		lblNewLabel_4.setBounds(152, 10, 151, 25);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(187, 45, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10); 
				
		passwordField = new JPasswordField();
		passwordField.setBounds(187, 70, 116, 21);
		contentPane.add(passwordField); 

		textField_1 = new JTextField();
		textField_1.setBounds(187, 95, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10); 

		
			
		btnNewButton = new JButton("등록하기");
		btnNewButton.setBounds(90, 165, 97, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(206, 165, 97, 23);
		contentPane.add(btnNewButton_1);
	}
}