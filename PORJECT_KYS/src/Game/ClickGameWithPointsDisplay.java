package Game;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ClickGameWithPointsDisplay extends JFrame {
    private int points = 0;
    private JLabel pointsLabel; // 포인트를 표시할 JLabel 추가

    public ClickGameWithPointsDisplay() {
        this.setTitle("클릭 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(getOwner());

        Container c = getContentPane();
        c.setLayout(null);

        JLabel basket = new JLabel(new ImageIcon(new ImageIcon("cat.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        basket.setBounds(125, 200, 50, 50);
        c.add(basket);

        pointsLabel = new JLabel("포인트: " + points); // 포인트 표시를 위한 JLabel
        pointsLabel.setBounds(10, 10, 100, 20);
        c.add(pointsLabel);

        c.addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e) {
                basket.setLocation(e.getX() - 25, 200);
            }

            public void mouseDragged(MouseEvent e) {}
        });

        c.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();

                ImageIcon heartIcon = new ImageIcon("heart.jpg");
                Image heartImage = heartIcon.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
                JLabel target = new JLabel(new ImageIcon(heartImage));
                target.setBounds(p.x, 0, 50, 50);
                c.add(target);
                repaint();

                Thread t = new Thread(new FallingObjectThread(target, basket));
                t.start();
            }

            public void mouseReleased(MouseEvent e) {}

            public void mouseClicked(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {}

            public void mouseExited(MouseEvent e) {}
        });

        this.setSize(300, 300);
        this.setVisible(true);
    }

    private class FallingObjectThread implements Runnable {
        private JLabel target;
        private JLabel basket;

        public FallingObjectThread(JLabel target, JLabel basket) {
            this.target = target;
            this.basket = basket;
        }

        public void run() {
            while (true) {
                int x = target.getX();
                int y = target.getY();

                target.setLocation(x, y + 5);

                if (target.getBounds().intersects(basket.getBounds())) {
                    remove(target);
                    repaint();
                    points += 10;
                    updatePointsLabel(); // 포인트 표시 업데이트
                    changeBackgroundColor();
                    return;
                }

                if (target.getY() > getHeight()) {
                    remove(target);
                    repaint();
                    return;
                }

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }

        private void updatePointsLabel() {
            pointsLabel.setText("포인트: " + points);
        }

        private void changeBackgroundColor() {
            getContentPane().setBackground(Color.PINK);

            Timer timer = new Timer(500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    getContentPane().setBackground(null);
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    public static void main(String[] args) {
        new ClickGameWithPointsDisplay();
    }
}





