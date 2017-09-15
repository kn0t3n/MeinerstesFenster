package com.sabel;

import javax.swing.*;

public class Fensterklasse extends JFrame {

    private JButton jbtnHallo;
    private JPanel jpnl;

    public Fensterklasse() {
        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        jbtnHallo = new JButton("Hallo");
        jpnl = new JPanel();
        jpnl.add(jbtnHallo);
        this.add(jpnl);
    }

}
