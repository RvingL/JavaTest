package GUI;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("计算器");
        jFrame.setSize(400, 400);
        jFrame.setLocation(200, 200);
        jFrame.setLayout(new GridLayout(4, 5, 8, 8));

        String[][] str = {{"7", "8", "9", "/", "sq"}, {"4", "5", "6", "*", "%"}, {"1", "2", "3", "-", "1/x"}, {"0", "+/-", ".", "+", "="}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                JButton jButton = new JButton(str[i][j]);
                jButton.setPreferredSize(new Dimension(5, 5));
                jFrame.add(jButton);
            }
        }
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
