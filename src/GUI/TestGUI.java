package GUI;

import javax.swing.*;

public class TestGUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("LOL");
        jf.setLayout(null);
        jf.setSize(500, 500);
        jf.setLocation(200, 200);
        JButton jb = new JButton("哈哈哈");
        jb.setBounds(50, 50, 200, 200);
        jf.add(jb);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
