package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fensterklasse extends JFrame {

    private Model model;

    private JButton jbtnA, jbtnB, jbtnC;
    private JPanel jpnlSouth, jPanel;

    public Fensterklasse() {
        this.setTitle("Mein erstes Fenster");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.initComponents();
        this.initEvents();
    }

    public void setColor(Farbe farbe) {
        switch (farbe) {
            case ROT:
                jPanel.setBackground(Color.RED);
                break;
            case BLAU:
                jPanel.setBackground(Color.BLUE);
                break;
            case GRUEN:
                jPanel.setBackground(Color.GREEN);
                break;
            case GELB:
                jPanel.setBackground(Color.YELLOW);
                break;
            default:
                jPanel.setBackground(Color.RED);
        }
        System.out.println(farbe);
    }

    private void initEvents() {
        jbtnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.pfeilAGedrueckt();
            }
        });
        jbtnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.pfeilBGedrueckt();
            }
        });
        jbtnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.pfeilCGedrueckt();
            }
        });
    }

    private void initComponents() {
        jbtnA = new JButton("A");
        jbtnB = new JButton("B");
        jbtnC = new JButton("C");
        jpnlSouth = new JPanel();
        jPanel = new JPanel();
        jpnlSouth.add(jbtnA);
        jpnlSouth.add(jbtnB);
        jpnlSouth.add(jbtnC);
        this.add(jPanel);
        this.add(jpnlSouth, BorderLayout.SOUTH);
    }

    public void setModel(Model model) {
        this.model = model;
    }

}
