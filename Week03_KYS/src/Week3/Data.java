package Week3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Data extends JFrame {
	public Data() {
		JPanel panel= new JPanel();
		add(panel);
		
		JLabel label1= new JLabel("이름");
		JLabel label2= new JLabel("패스워드");
		JTextField field1= new JTextField(15);
		JTextField field2=new JTextField(15);
		
		JButton button1= new JButton("등록하기");
		JButton button2 = new JButton("취소");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button1);
		panel.add(button2);
		
		
		
		setSize(300,150);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		Data f= new Data();


	}

}