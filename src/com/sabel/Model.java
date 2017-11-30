package com.sabel;

public class Model {

    private Fensterklasse fensterklasse;

    private Farbe farbe;

    public Model(Fensterklasse fensterklasse) {
        this.fensterklasse = new Fensterklasse();
        start();
    }

    private void start() {
        farbe = Farbe.ROT;
        fensterklasse.setColor(farbe);
    }

    public void pfeilAGedrueckt() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.GRUEN;
                break;
            case BLAU:
            case GRUEN:
                farbe = Farbe.BLAU;
                break;
            case GELB:
                System.exit(0);
                break;
        }
        fensterklasse.setColor(farbe);
    }

    public void pfeilBGedrueckt() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.BLAU;
                break;
            case BLAU:
                farbe = Farbe.ROT;
                break;
            case GRUEN:
                farbe = Farbe.GRUEN;
                break;
            case GELB:
                farbe = Farbe.BLAU;
                break;
        }
        fensterklasse.setColor(farbe);
    }

    public void pfeilCGedrueckt() {
        switch (farbe) {
            case ROT:
                farbe = Farbe.ROT;
                break;
            case BLAU:
                farbe = Farbe.GRUEN;
                break;
            case GRUEN:
                farbe = Farbe.GELB;
                break;
            case GELB:
                farbe = Farbe.ROT;
                break;
        }
        fensterklasse.setColor(farbe);
    }
}
