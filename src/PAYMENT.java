import javax.swing.*;

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
        super("PAYMENT");
        this.setContentPane(this.panel1);
        this.setSize(250,250);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
