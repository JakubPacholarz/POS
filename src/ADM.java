import javax.swing.*;

public class ADM extends JFrame {
    private JPanel pan1;
    private JPanel pan2;
    private JPanel pan3;
    private JPanel pan4;
    private JPasswordField password;
    private JTextField nick;
    private JLabel podajn;
    private JLabel podajh;
    private JLabel act;
    private JButton LOGINButton;


    public ADM()
    {
        super("ADMIN ACCOUNT");
        this.setContentPane(this.pan1);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(250,250);
    }
}
