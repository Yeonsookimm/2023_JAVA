package week04;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Card extends JFrame {
	Image img;
	
	
	
	public Card() {
		setTitle("BusinessCard");
		setSize(1200,500);
		ImageIcon icon = new ImageIcon("birdpic.jpg");
		img=icon.getImage();
		add(new MyPanel());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,20,10,null);
			
			String text = "김연수";
			           
            int textX = 20; // 텍스트의 x 좌표
            int textY = img.getHeight(null) + 30; // 텍스트의 y 좌표
            g.drawString(text, textX, textY);
        }
    }

            
	

	
	

	public static void main(String[] args) {
		Card f= new Card();

	}

}
