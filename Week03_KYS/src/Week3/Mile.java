package Week3;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mile extends JFrame {
    private JTextField mileTextField;
    private JLabel resultLabel;

    public Mile() {
        setTitle("마일을 킬로미터로 변환");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JPanel inputPanel = new JPanel();
        JLabel mileLabel = new JLabel("마일을 입력하세요:");
        mileTextField = new JTextField(10);

        inputPanel.add(mileLabel);
        inputPanel.add(mileTextField);

        JPanel buttonPanel = new JPanel();
        JButton convertButton = new JButton("변환");
        buttonPanel.add(convertButton);

        JPanel resultPanel = new JPanel();
        resultLabel = new JLabel("");

        resultPanel.add(resultLabel);

        add(inputPanel);
        add(buttonPanel);
        add(resultPanel);

        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                convertMileToKilometer();
            }
        });
    }

    private void convertMileToKilometer() {
        double miles = Double.parseDouble(mileTextField.getText());
        double kilometers = miles * 1.609344;
        resultLabel.setText( " -> " + kilometers);
    }
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Mile converter = new Mile();
            converter.setVisible(true);
        });
    }
}