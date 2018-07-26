import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    JFrame frame;
    JTextField tf;
    JButton but1,but2,but3,but4,but5,but6,but7,but8,but9,but0,butdec,butplu,butmin,butmul,butdiv,buteq,butclr,butdel;

    static double a = 0,b = 0,res = 0;

    static int val = 0;

    Calculator() {

        frame = new JFrame("Calculator");
        tf = new JTextField();

        but0 = new JButton("0");

        but1 = new JButton("1");

        but2 = new JButton("2");

        but3 = new JButton("3");

        but4 = new JButton("4");

        but5 = new JButton("5");

        but6 = new JButton("6");

        but7 = new JButton("7");

        but8 = new JButton("8");

        but9 = new JButton("9");


        butplu = new JButton("+");
        butmin = new JButton("-");
        butmul = new JButton("X");
        butdiv = new JButton("/");
        butdec = new JButton(".");
        buteq = new JButton("=");

        butclr = new JButton("Clear");
        butdel = new JButton("Delete");

        tf.setBounds(30, 40, 280, 30);
        but7.setBounds(40, 100, 50, 40);
        but8.setBounds(110, 100, 50, 40);
        but9.setBounds(180, 100, 50, 40);
        butdiv.setBounds(250, 100, 50, 40);

        but4.setBounds(40, 170, 50, 40);
        but5.setBounds(110, 170, 50, 40);
        but6.setBounds(180, 170, 50, 40);
        butmul.setBounds(250, 170, 50, 40);

        but1.setBounds(40, 240, 50, 40);
        but2.setBounds(110, 240, 50, 40);
        but3.setBounds(180, 240, 50, 40);
        butmin.setBounds(250, 240, 50, 40);

        butdec.setBounds(40, 310, 50, 40);
        but0.setBounds(110, 310, 50, 40);
        buteq.setBounds(180, 310, 50, 40);
        butplu.setBounds(250, 310, 50, 40);

        butdel.setBounds(60, 380, 100, 40);
        butclr.setBounds(180, 380, 100, 40);

        frame.add(tf);
        frame.add(but7);
        frame.add(but8);
        frame.add(but9);
        frame.add(butdiv);
        frame.add(but4);
        frame.add(but5);
        frame.add(but6);
        frame.add(butmul);
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(butmin);
        frame.add(butdec);
        frame.add(but0);
        frame.add(buteq);
        frame.add(butplu);
        frame.add(butdel);
        frame.add(butclr);

        frame.setLayout(null);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 500);

        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        but0.addActionListener(this);

        butplu.addActionListener(this);
        butmin.addActionListener(this);
        butmul.addActionListener(this);
        butdiv.addActionListener(this);
        buteq.addActionListener(this);

        butdel.addActionListener(this);
        butclr.addActionListener(this);
        butdec.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == but1){
            tf.setText(tf.getText().concat("1"));
        }

        if(e.getSource() == but2){
            tf.setText(tf.getText().concat("2"));
        }

        if(e.getSource() == but3){

            tf.setText(tf.getText().concat("3"));
        }

        if(e.getSource() == but4){

            tf.setText(tf.getText().concat("4"));
        }
        if(e.getSource() == but5){

            tf.setText(tf.getText().concat("5"));
        }
        if(e.getSource() == but6){

            tf.setText(tf.getText().concat("6"));
        }
        if(e.getSource() == but7){

            tf.setText(tf.getText().concat("7"));
        }
        if(e.getSource() == but8){

            tf.setText(tf.getText().concat("8"));
        }
        if(e.getSource() == but9){

            tf.setText(tf.getText().concat("9"));
        }
        if(e.getSource() == but0){

            tf.setText(tf.getText().concat("0"));
        }
        if(e.getSource() == butdec){

            tf.setText(tf.getText().concat("."));
        }

        if(e.getSource() == butplu){

            a = Double.parseDouble(tf.getText());
            val = 1;
            tf.setText("");
            
        }

        if(e.getSource() == butmin){

            a = Double.parseDouble(tf.getText());

            val = 2;
             tf.setText("");
        }

        if(e.getSource() == butmul){

            a = Double.parseDouble(tf.getText());

            val = 3;
            tf.setText("");
        }

        if(e.getSource() == butdiv){

            a = Double.parseDouble(tf.getText());

            val = 4;
             tf.setText("");
        }

        if(e.getSource() == buteq){
             b = Double.parseDouble(tf.getText());

             switch(val){

                 case 1: res = a+b;
                 break;

                 case 2: res = a-b;
                 break;

                 case 3: res = a*b;
                 break;

                 case 4: res = a/b;
                 break;

                 default: res = 0;
             }

             tf.setText(" " +res);
        }

        if(e.getSource() == butclr){

            tf.setText("");
        }

        if(e.getSource() == butdel){

            String str = tf.getText();

            tf.setText("");

            for(int i = 0; i<str.length()-1; i++){

                tf.setText(tf.getText()+str.charAt(i));
            }
        }

    }

    public static void main(String args[]){

        new Calculator();
    }



}
