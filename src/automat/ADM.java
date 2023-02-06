package automat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ADM extends JFrame implements ActionListener {
    private JPanel pan1;
    private JPanel pan2;
    private JPanel pan3;
    private JPanel pan4;
    private JPasswordField password_text;
    private JTextField unsername;
    private JLabel podajn;
    private JLabel podajh;
    private JLabel act;
    private JButton LOGINButton;
    private JLabel haslo;
    private JLabel nick1;


    public ADM() {
        super("ADMIN ACCOUNT");
        this.setContentPane(this.pan1);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(350, 350);
        LOGINButton.addActionListener(this);

    }

    public static void main(String[] args) {
        new ADM();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = unsername.getText();
        String password = password_text.getText();
        if (username.trim().equals("admin") && password.trim().equals("admin"))
        {
            SUPPLY ttt = new SUPPLY();
            ttt.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"WRONG PASSWORD");
        }


    }
}
