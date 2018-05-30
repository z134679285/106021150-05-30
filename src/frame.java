import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class frame extends JFrame {
    private JButton big = new JButton("加密");
    private JButton small = new JButton("解密");
    private JButton exit = new JButton("EXIT");
    private JLabel lab = new JLabel("password");
    private JTextField field = new JTextField("");
    private JTextArea area = new JTextArea("");
    private JTextArea area1 = new JTextArea("");

    public frame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(100, 100, 700, 600);
        this.add(field);
        this.add(area);
        this.add(area1);
        this.add(exit);
        this.add(lab);
        this.add(big);
        this.add(small);
        lab.setSize(150, 50);
        lab.setLocation(275, 50);
        field.setSize(75, 75);
        field.setLocation(275, 100);
        big.setSize(100, 50);
        big.setLocation(275, 200);
        small.setSize(100, 50);
        small.setLocation(275, 250);
        exit.setSize(100, 50);
        exit.setLocation(275, 300);
        area.setPreferredSize(new Dimension(200, 600));
        area.setBounds(0, 0, 250, 600);
        area1.setPreferredSize(new Dimension(200, 600));
        area1.setBounds(400, 0, 400, 600);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
        big.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 
            }
        });
    }
}


