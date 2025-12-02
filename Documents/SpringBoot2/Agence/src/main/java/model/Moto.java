package model;

import myEnum.TypeCarburant;

public class Moto extends  Vehicule {
    private String cylindre;

    public Moto(String cylindre) {
        this.cylindre = cylindre;
    }

    public Moto(String model, String marque, int annee, TypeCarburant carburant, Agence agence, String cylindre) {
        super(model, marque, annee, carburant, agence);
        this.cylindre = cylindre;
    }

    public String getCylindre() {
        return cylindre;
    }

    public void setCylindre(String cylindre) {
        this.cylindre = cylindre;
    }

    @Override
    public String toString() {
        return "Moto{" + "cylindre='" + cylindre + ", carburant=" + carburant + '}';
    }
}
