package model;

import myEnum.TypeCarburant;

public class Voiture extends  Vehicule{
   private int nbPortes;


    public Voiture(String model, String marque, int annee, TypeCarburant carburant, Agence agence, int nbPortes) {
        super(model, marque, annee, carburant, agence);
        this.nbPortes = nbPortes;
    }

    public int getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(int nbPortes) {
        this.nbPortes = nbPortes;
    }


    @Override
    public String toString() {
        return "Voiture{" + " nbPortes=" + nbPortes + ", carburant=" + carburant + '}';
    }
}
