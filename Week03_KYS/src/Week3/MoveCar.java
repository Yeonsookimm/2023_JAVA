package Week3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCar extends JFrame {
    private JLabel carLabel;
    private int carPositionX;

    public MoveCar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);

        carPositionX = 0;

        
        carLabel = new JLabel(new ImageIcon("car1.png"));
        carLabel.setBounds(carPositionX, 150, 500,250);

       
        JButton leftButton = new JButton("왼쪽");
        leftButton.setBounds(200, 600,100,50);
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveCarLeft();
            }
        });

        
        JButton rightButton = new JButton("오른쪽");
        rightButton.setBounds(400, 600, 100,50);
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveCarRight();
            }
        });

        
        add(carLabel);
        add(leftButton);
        add(rightButton);

        setLayout(null);
        setVisible(true);
    }

   
    private void moveCarLeft() {
        if (carPositionX > 0) {
            carPositionX -= 10; 
            carLabel.setBounds(carPositionX, 150,500,250);
        }
    }


    private void moveCarRight() {
        if (carPositionX < getWidth() - 100) {
            carPositionX += 10;
            carLabel.setBounds(carPositionX, 150, 500,250);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MoveCar();
            }
        });
    }
}
