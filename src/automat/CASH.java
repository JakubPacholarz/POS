package automat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CASH extends JFrame implements ActionListener {
    private JPanel panel1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JButton a1zlButton;
    private JButton a2zlButton;
    private JButton a5zlButton;
    private JButton a10zlButton;
    int x = 1 ;

    double total = 0.0;

    public  CASH()
    {
        super("OPŁATA GOTÓWKĄ");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(250, 250);



        a1zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =1;
                a1zlButton.setText("1");
                textField2.setText(a1zlButton.getText());
            }
        });
        a2zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =2;
                a1zlButton.setText("2");
                textField2.setText(a1zlButton.getText());
            }
        });
        a5zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =5;
                a1zlButton.setText("5");
                textField2.setText(a1zlButton.getText());
            }
        });
        a10zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x =10;
                a1zlButton.setText("10");
                textField2.setText(a1zlButton.getText());
            }
        });
    }
     public JTextField calosc2()
     {
         textField3.setText(String.valueOf(textField2));
         return textField2;
     }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
