import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
public class MAINFRAME2 extends JFrame{
    private JButton jbt = new JButton("START");

    private JButton jbt1 = new JButton("EXIT");

    private JLabel jlb = new JLabel("說明");

    private JLabel jb1 = new JLabel( );


    private JPanel jpn = new JPanel(new GridLayout(2,1,3,3));

    private JPanel jpn1 = new JPanel(new GridLayout(2,1,3,3));

    private JPanel jpn2 = new JPanel(new GridLayout(2,1,3,3));

    private ImageIcon img1 = new ImageIcon("3.jpg");

    private Timer t1;

    private Container cp;

    private  int count =0;



    public MAINFRAME2(){

        init();

    }

    private void init(){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setBounds(0,0,1800,1000);

        cp = this.getContentPane();

        jb1.setBounds(100,200,40,40);

        jb1.setIcon(img1);

        jpn.add(jbt);

        jpn.add(jbt1);

        jpn1.add(jlb);

        jpn2.add(jb1);

        cp.add(jpn,BorderLayout.WEST);

        cp.add(jpn1,BorderLayout.EAST);

        cp.add(jpn2,BorderLayout.CENTER);



        t1 = new Timer(100, new AbstractAction() {

            @Override

            public void actionPerformed(ActionEvent e) {



            }

        });

        jbt.addMouseListener(new MouseAdapter() {

            @Override

            public void mousePressed(MouseEvent e) {

                count = count + 1;

                MAINFRAME2.this.setTitle(Integer.toString(count));

                t1.start();

            }

        });





        jbt1.addActionListener(new ActionListener() {

            @Override

            public void actionPerformed(ActionEvent e) {

                System.exit(0);

            }

        });

    }

}

