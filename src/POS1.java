import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POS1 extends JFrame{


    protected JPanel panel1;
    protected JPanel panel2;
    protected JPanel panel3;
    protected JPanel panel4;
    protected JLabel tytul;
    protected JPanel panel5;
    protected JTextArea rachunek;
    protected JPanel panel6;
    protected JPanel panel7;
    protected JButton btn1;
    protected JSpinner spn1;
    protected JButton btn2;
    protected JSpinner spn2;
    protected JButton btn3;
    protected JSpinner spn3;
    protected JPanel panel8;
    protected JPanel panel9;
    protected JButton exit;
    protected JButton reset;
    protected JButton btn4;
    protected JSpinner spn4;
    protected JPanel panel10;
    protected JButton btn5;
    protected JSpinner spn5;
    protected JPanel panel11;
    protected JButton btn6;
    protected JSpinner spn6;
    protected JPanel panel12;
    protected JButton btn7;
    protected JSpinner spn7;
    protected JPanel panel13;
    protected JButton btn8;
    protected JSpinner spn8;
    protected JButton total;
    protected JButton pay;
    protected JPanel panel14;
    protected JPanel panel15;
    protected JButton a70zlButton;
    protected JSpinner spn9;
    protected JPanel panel16;
    protected JButton a50zlButton;
    protected JSpinner spn10;
    protected JPanel panel17;
    protected JButton a40zlButton;
    protected JSpinner spn11;
    protected JPanel panel18;
    protected JButton a30zlButton;
    protected JSpinner spn12;
    protected JPanel panel19;
    protected JButton admin;
    protected JButton SUPPLYButton;
    protected JLabel data;
    protected JLabel godzina;
    protected JCheckBox checkBox1;
    protected JCheckBox checkBox2;
    protected JCheckBox checkBox3;
    protected JCheckBox checkBox4;
    protected JCheckBox checkBox5;
    protected JCheckBox checkBox6;
    protected JCheckBox checkBox7;
    protected JCheckBox checkBox8;
    protected JCheckBox checkBox9;
    protected JCheckBox checkBox10;
    protected JCheckBox checkBox11;
    protected JCheckBox checkBox12;
    protected JLabel calosc;
    protected JTextField topay;
    protected JLabel lablepepsi;
    private JLabel lablecola;
    private JLabel lalblepaluszki;
    private JLabel lablemaslo;
    private JLabel lablemydlo;
    private JLabel lablemakaron;
    private JLabel lablekotlet;
    private JLabel lableziemniak;
    private JLabel lablemirinda;
    private JLabel lablesok;
    private JLabel lablejabko;
    private JLabel lablerogalik;

    protected int x;
    protected double total1;


    public void resetowanie()
    {
            spn1.setValue(0);
            spn2.setValue(0);
            spn3.setValue(0);
            spn4.setValue(0);
            spn5.setValue(0);
            spn6.setValue(0);
            spn7.setValue(0);
            spn8.setValue(0);
            spn9.setValue(0);
            spn10.setValue(0);
            spn11.setValue(0);
            spn12.setValue(0);
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
            checkBox4.setSelected(false);
            checkBox5.setSelected(false);
            checkBox6.setSelected(false);
            checkBox7.setSelected(false);
            checkBox8.setSelected(false);
            checkBox9.setSelected(false);
            checkBox10.setSelected(false);
            checkBox11.setSelected(false);
            checkBox12.setSelected(false);
            total1 = 0.0;
            x=0;
            rachunek.setText(null);
            topay.setText("0.00");
            total.setEnabled(true);

    }

    public boolean qtyiszero(int qty) {
        if (qty == 0) {
            JOptionPane.showMessageDialog(null, "Prosze zwiekszyc ilosc przedmiotow");
            return false;
        }
        return true;
    }





    public POS1()
    {
        super("AUTOMAT Z JEDZENIEM");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SHOWDATA();
        calosc();








        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetowanie();
            }
        });

        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ADM admin = new ADM();
                admin.setVisible(true);
            }
        });
        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PAYMENT pay = new PAYMENT();
                pay.setVisible(true);
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn1.getValue();
                spn1.setValue(x+1);


            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn5.getValue();
                spn5.setValue(x+1);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn2.getValue();
                spn2.setValue(x+1);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn3.getValue();
                spn3.setValue(x+1);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn4.getValue();
                spn4.setValue(x+1);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn6.getValue();
                spn6.setValue(x+1);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn7.getValue();
                spn7.setValue(x+1);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn8.getValue();
                spn8.setValue(x+1);
            }
        });
        a40zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn11.getValue();
                spn11.setValue(x+1);
            }
        });a50zlButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int x = 0;
            x = (int) spn10.getValue();
            spn10.setValue(x+1);
        }
    });
        a30zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn12.getValue();
                spn12.setValue(x+1);
            }
        });
        a70zlButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                x = (int) spn9.getValue();
                spn9.setValue(x+1);
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn1.getValue().toString());
                if (qtyiszero(qty) && checkBox1.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 5.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablepepsi.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox1.setSelected(false);
                }
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn2.getValue().toString());
                if (qtyiszero(qty) && checkBox2.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 8.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablemakaron.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox2.setSelected(false);
                }
            }
        });
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn3.getValue().toString());
                if (qtyiszero(qty) && checkBox3.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 5.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablekotlet.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox3.setSelected(false);
                }
            }
        });
        checkBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn4.getValue().toString());
                if (qtyiszero(qty) && checkBox4.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 9.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lableziemniak.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox4.setSelected(false);
                }
            }
        });
        checkBox5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn5.getValue().toString());
                if (qtyiszero(qty) && checkBox5.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 6.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablecola.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox5.setSelected(false);
                }
            }
        });
        checkBox6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn6.getValue().toString());
                if (qtyiszero(qty) && checkBox6.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 6.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablemydlo.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox6.setSelected(false);
                }
            }
        });
        checkBox7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn7.getValue().toString());
                if (qtyiszero(qty) && checkBox7.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 2.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablesok.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox7.setSelected(false);
                }
            }
        });
        checkBox8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn8.getValue().toString());
                if (qtyiszero(qty) && checkBox8.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 5.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablemirinda.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox8.setSelected(false);
                }
            }
        });
        checkBox12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn9.getValue().toString());
                if (qtyiszero(qty) && checkBox12.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 7.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lalblepaluszki.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox12.setSelected(false);
                }
            }
        });
        checkBox9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn10.getValue().toString());
                if (qtyiszero(qty) && checkBox9.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 5.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablemaslo.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox9.setSelected(false);
                }
            }
        });
        checkBox10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn11.getValue().toString());
                if (qtyiszero(qty) && checkBox10.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 4.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablejabko.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox10.setSelected(false);
                }
            }
        });
        checkBox11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qty = Integer.parseInt(spn12.getValue().toString());
                if (qtyiszero(qty) && checkBox11.isSelected()) {
                    x++;
                    if (x == 1) {
                        double total11 = total1;
                    }
                    double cena = qty * 3.0;
                    total1 += cena;
                    rachunek.setText(rachunek.getText() + x + ". " + lablerogalik.getText() + "\t\t" + cena);
                    calosc();
                } else {
                    checkBox11.setSelected(false);
                }
            }
        });


        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total1==0.0)
                {
                    JOptionPane.showMessageDialog(null, "Nie wybrałeś ani jednego przedmiotu - proszę wybrać przedmiot");
                }else {
                    rachunek.setText(rachunek.getText() + "\n^^^^^\n" + " TOTAL BILL IS: \t\t\t" + total1+"\n"+ "^^^^^");
                    total.setEnabled(false);
                }
            }
        });
    }


        void SHOWDATA() {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(POS1.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Date date = new Date();
                        SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                        SimpleDateFormat df = new SimpleDateFormat("EEEE,dd-MM-yyyy");
                        String time = tf.format(date);
                        godzina.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                        data.setText(df.format(date));
                    }
                }
            }).start();
        }

        public void calosc()
        {
            rachunek.setText(String.valueOf(total1));

        }

}

