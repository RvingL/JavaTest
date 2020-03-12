package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionListener {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("哈利路亚");
        jFrame.setLayout(null);
        jFrame.setSize(1000, 800);
        jFrame.setLocation(580, 200);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\94425\\Desktop\\1.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        JButton jButton = new JButton("点击隐藏");
        jButton.setBounds(150, 200, 100, 30);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText(jButton.getText().equals("点击隐藏")?"点击显示":"点击隐藏");
                l.setVisible(jButton.getText().equals("点击隐藏")?true:false);
            }
        });
        jFrame.add(l);
        jFrame.add(jButton);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
