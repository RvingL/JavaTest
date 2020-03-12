package GUI;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestKeyListener {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("哔哩吧啦");
        jFrame.setLayout(null);
        jFrame.setSize(1000, 800);
        jFrame.setLocation(580, 200);

        final JLabel l = new JLabel();
        ImageIcon i = new ImageIcon("C:\\Users\\94425\\Desktop\\1.jpg");
        l.setIcon(i);
        l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

        jFrame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case 40:
                        l.setLocation(l.getX(), l.getY() + 10);
                        break;
                    case 38:
                        l.setLocation(l.getX(), l.getY() - 10);
                        break;
                    case 37:
                        l.setLocation(l.getX() - 10, l.getY());
                        break;
                    case 39:
                        l.setLocation(l.getX() + 10, l.getY());
                        break;
                    default:
                        l.setLocation(l.getX(), l.getY());
                        break;
                }
            }
        });
        jFrame.add(l);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
