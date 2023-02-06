package automat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CARD extends JFrame implements ActionListener {
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton RESETButton;
    private JButton POTWIERDZButton;


    public CARD()
{
    super("podaj pin do karty");
    this.setContentPane(this.panel1);
    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setSize(250, 250);
    POTWIERDZButton.addActionListener(this);

    RESETButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            reset();
        }
    });
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String passweord = passwordField1.getText();
        if (passweord.trim().equals("1234"))
        {
            JOptionPane.showMessageDialog(null,"PIN POPRAWNY DZIEKUJĘ ZA ZAKUPY");

        }else {
            JOptionPane.showMessageDialog(null,"ZŁY PIN POLICJA JEDZIE");
        }
    }

    public void reset()
    {
        passwordField1.setText(null);
    }
}