package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class TestMouseListener {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("哔哩吧啦");
        jFrame.setLayout(null);
        jFrame.setSize(1000, 800);
        jFrame.setLocation(580, 200);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\94425\\Desktop\\2.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        l.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Random random = new Random();
                int x = random.nextInt(jFrame.getWidth() - l.getWidth());
                int y = random.nextInt(jFrame.getHeight() - l.getHeight());

                l.setLocation(x, y);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jFrame.add(l);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
