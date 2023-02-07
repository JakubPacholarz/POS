package automat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SUPPLY extends POS1{


    protected int amount;
    private JPanel panelqwe;
    private JPanel pan1;

    private JButton show1;
    private JTextField textField1;
    private JButton addskojab;
    private JButton addpepsi;
    private JButton addmakaron;
    private JButton addkotlet;
    private JButton addziemniak;
    private JButton addmirinda;
    private JButton addsok;
    private JButton addmydlo;
    private JButton addcola;
    private JButton addpaluszki;
    private JButton addmaslo;
    private JButton addrogalik;
    private JButton show2;
    private JButton show3;
    private JButton show4;
    private JButton show5;
    private JButton show6;
    private JButton show7;
    private JButton show8;
    private JButton show9;
    private JButton show10;
    private JButton show11;
    private JButton show12;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField txpepsi;
    protected int x =10;

    public SUPPLY() {


        this.setContentPane(this.panelqwe);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(500, 500);

        addskojab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addcola.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addkotlet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addmakaron.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addmaslo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addmirinda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addmydlo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addpaluszki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addpepsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addrogalik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addsok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });addziemniak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(x+1));
            }
        });
        show1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(String.valueOf(10));
            }
        });

        show2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText(String.valueOf(10));

            }
        });
        show3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText(String.valueOf(11));
            }
        });
        show4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField4.setText(String.valueOf(2));
            }
        });
        show5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField5.setText(String.valueOf(3));
            }
        });
        show6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(String.valueOf(13));
            }
        });
        show7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField7.setText(String.valueOf(11));
            }
        });
        show8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField8.setText(String.valueOf(15));
            }
        });
        show9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField9.setText(String.valueOf(13));
            }
        });
        show10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField10.setText(String.valueOf(11));
            }
        });
        show11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField11.setText(String.valueOf(15));
            }
        });
        show12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField12.setText(String.valueOf(20));
            }
        });

    }





}












