package week04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxDemo extends JFrame {
    private double totalPrice = 0.0;
    private JLabel priceLabel;

    public CheckBoxDemo() {
        setTitle("Checkbox Demo");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel checkboxPanel = new JPanel();
        checkboxPanel.setLayout(new BoxLayout(checkboxPanel, BoxLayout.Y_AXIS));

        // 체크박스 생성
        JCheckBox checkboxA = new JCheckBox("엔진오일 교환");
        JCheckBox checkboxB = new JCheckBox("자동변속기 교환");
        JCheckBox checkboxC = new JCheckBox("에어컨 필터 교환");
        JCheckBox checkboxD = new JCheckBox("타이어 교환");

        // 체크박스 이벤트 리스너 등록
        checkboxA.addActionListener(new CheckboxListener(45000));
        checkboxB.addActionListener(new CheckboxListener(80000));
        checkboxC.addActionListener(new CheckboxListener(30000));
        checkboxD.addActionListener(new CheckboxListener(100000));

        // 가격 표시 레이블
        priceLabel = new JLabel("현재까지의 가격은 0원입니다.");
        

        // 체크박스를 패널에 추가
        checkboxPanel.add(checkboxA);
        checkboxPanel.add(checkboxB);
        checkboxPanel.add(checkboxC);
        checkboxPanel.add(checkboxD);

        // 가격 레이블을 패널에 추가
        mainPanel.add(checkboxPanel, BorderLayout.WEST);
        mainPanel.add(priceLabel, BorderLayout.SOUTH);

        add(mainPanel);
        setVisible(true);
    }

    private class CheckboxListener implements ActionListener {
        private double price;

        public CheckboxListener(double price) {
            this.price = price;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JCheckBox source = (JCheckBox) e.getSource();

            if (source.isSelected()) {
                totalPrice += price;
            } else {
                totalPrice -= price;
            }

            // 가격 레이블 업데이트
            priceLabel.setText("현재까지의 가격은 " + totalPrice + "원입니다.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CheckBoxDemo());
    }
}