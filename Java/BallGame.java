import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.*;

public class Game {

    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Simple Swing App");

        // Create buttons
        JButton btnArrowKeys = new JButton("Arrow Keys");
        JButton btnADKeys = new JButton("A and D Keys");

        // Set the layout manager to null for absolute positioning
        frame.setLayout(null);

        // Button positions
        btnArrowKeys.setBounds(50, 100, 150, 30);  // Position (50,100) and size (150x30)
        btnADKeys.setBounds(200, 100, 150, 30);  // Position (200,100) and size (150x30)

        // Add buttons to the JFrame's content pane
        frame.add(btnArrowKeys);
        frame.add(btnADKeys);

        // Set the default close operation (exit the program when the window is closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the window size
        frame.setSize(600, 400); // Adjust size for better view

        // Make the window visible
        frame.setVisible(true);

        // Add KeyListener to frame
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                // Move button with arrow keys (left and right)
                if (keyCode == KeyEvent.VK_RIGHT) { // Right arrow key
                    int currentX = btnArrowKeys.getX();
                    btnArrowKeys.setLocation(currentX + 10, btnArrowKeys.getY());  // Move right
                } else if (keyCode == KeyEvent.VK_LEFT) { // Left arrow key
                    int currentX = btnArrowKeys.getX();
                    btnArrowKeys.setLocation(currentX - 10, btnArrowKeys.getY());  // Move left
                }

                // Move button with A and D keys
                if (keyCode == KeyEvent.VK_D) { // D key
                    int currentX = btnADKeys.getX();
                    btnADKeys.setLocation(currentX + 10, btnADKeys.getY());  // Move right
                } else if (keyCode == KeyEvent.VK_A) { // A key
                    int currentX = btnADKeys.getX();
                    btnADKeys.setLocation(currentX - 10, btnADKeys.getY());  // Move left
                }
            }
        });

        // Set the JFrame to be focusable so it can receive key events
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
}
