import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing App");
        JButton btn = new JButton("Click Me");
        JButton btn1 = new JButton("Click Me1");

        btn.addActionListener(e -> System.out.println("Hello, Swing!"));
        btn1.addActionListener(e -> System.out.println("Hello 2"));

        frame.setLayout(null);
        btn.setBounds(0, 0, 150, 30);
        btn1.setBounds(100, 500, 150, 30);
        frame.add(btn);
        frame.add(btn1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setVisible(true);

        // Make ONLY the first button (btn) movable
        movable(btn, frame);
    }

    public static void movable(JButton button, JFrame frame) {
        // Use a SINGLE MouseAdapter to handle both press and drag events
        MouseAdapter adapter = new MouseAdapter() {
            private int offsetX, offsetY; // Shared between events

            @Override
            public void mousePressed(MouseEvent e) {
                offsetX = e.getX(); 
                offsetY = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // Calculate new position relative to parent
                Point mousePoint = e.getPoint();
                Point parentPoint = SwingUtilities.convertPoint(button, mousePoint, button.getParent());
                
                int newX = parentPoint.x - offsetX;
                int newY = parentPoint.y - offsetY;

                // Constrain within parent bounds
                int maxX = button.getParent().getWidth() - button.getWidth();
                int maxY = button.getParent().getHeight() - button.getHeight();
                newX = Math.max(0, Math.min(newX, maxX));
                newY = Math.max(0, Math.min(newY, maxY));

                button.setLocation(newX, newY);
            }
        };

        // Attach the SAME adapter to both listener types
        button.addMouseListener(adapter);
        button.addMouseMotionListener(adapter);
    }
}