package automat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PAYMENT extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JLabel forma;
    private JPanel panel3;
    private JPanel panelkarta;
    private JPanel panelcash;
    private JLabel card;
    private JLabel cash;
    private JButton cardpay;
    private JButton cahspay;
    private JLabel amount;
    private JTextField howmuchtopay;

    public PAYMENT()
    {
        super("automat.PAYMENT");
        this.setContentPane(this.panel1);
        this.setSize(250,250);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        howmuchtopay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                POS1 total1 = new POS1();
                howmuchtopay.setText(String.valueOf(total1));
            }
        });
        cardpay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CARD karta = new CARD();
                karta.setVisible(true);


            }
        });
        cahspay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CASH gotowka = new CASH();
                gotowka.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        PAYMENT a = new PAYMENT();
        a.form();
    }

    void form()
    {
        howmuchtopay = new JTextField();

    }


}
