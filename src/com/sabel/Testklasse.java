package com.sabel;

import javax.swing.*;

public class Testklasse {

    public static void main(String[] args) {

        Fensterklasse fenster = new Fensterklasse();
        Model model = new Model(fenster);
        fenster.setModel(model);
        fenster.setVisible(true);
    }

}
