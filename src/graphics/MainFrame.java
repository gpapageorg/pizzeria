package graphics;

import Simulator.Simulation;

import javax.swing.*;
import javax.swing.plaf.SeparatorUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame extends JFrame
{
    JTextField textbox = new JTextField(5);
    String text;
    public MainFrame()
    {
        JFrame mainFrame = new JFrame();
        mainFrame.setTitle("Pizzeria Simulator");
        mainFrame.setBounds(0,0,300,400);
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setLayout(new GridLayout(7,1));
        mainFrame.add(createTextPanel("Number"));
        mainFrame.add(createTextPanel("Of"));
        mainFrame.add(createTextPanel("Customers"));
        mainFrame.add(CreateTextBox());
        mainFrame.add(createButton());
        mainFrame.setVisible(true);


    }

    private JPanel createTextPanel(String text)
    {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JLabel label = new JLabel(text);
        label.setFont(new Font("Verdana", Font.BOLD, 30));
        label.setForeground(Color.BLACK);
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);
        return panel;
    }

    private JPanel CreateTextBox()
    {
        JPanel panel = new JPanel();
        Font textFont = new Font("Verdana", Font.BOLD, 20);
        textbox.setHorizontalAlignment(JTextField.CENTER);
        textbox.setFont(textFont);
        panel.add(textbox);
        return panel;

    }
    private JPanel createButton()
    {
        JPanel panel = new JPanel();
        Font textFont = new Font("Verdana", Font.BOLD, 20);
        JButton btn = new JButton("Simulate");
        btn.setFont(textFont);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                text = textbox.getText();
                Simulation sim = new Simulation(Integer.parseInt(text));
                System.out.println(Integer.parseInt(text));
            }
        });
        panel.add(btn);
        return panel;
    }

}
