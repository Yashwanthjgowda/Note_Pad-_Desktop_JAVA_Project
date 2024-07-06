package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    
    About() {
        setBounds(400, 100, 600, 500);
        setLayout(null);

        // Load and scale the first image (window.png)
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel headerIcon = new JLabel(i3);
        headerIcon.setBounds(70,40,400,80);
        add(headerIcon);

        // Load and scale the second image (notepad.png)
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon = new JLabel(i6);
        icon.setBounds(60, 180, 70, 70);
        add(icon);
        
        JLabel text = new JLabel("<html>Code for Interview<br>Version 0.1.0 (Build Java)<br>Code for Interview. All rights reserved.</html>");
        text.setBounds(200, 120, 300, 80);
        text.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(text);
        
        JButton b1 = new JButton("OK");
        b1.setBounds(250, 350, 100, 25);
        b1.addActionListener(this);
        add(b1);

        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() instanceof JButton) {
            JButton source = (JButton) ae.getSource();
            if (source.getText().equals("OK")) {
                this.setVisible(false); // Hide the About window
            }
        }
    }

    public static void main(String[] args) {
        new About();
    }
}
