package model;

import myEnum.TypeCarburant;

import java.util.ArrayList;
import java.util.List;

public class Vehicule {
    private static long cpt = 0; /* pourquoi ici on fait un private static au lieu de private long*/

    private  long id;
    private String model;
    private String marque;
    private  int annee;
    TypeCarburant carburant;
    private Agence agence;
    private List<Location> locations = new ArrayList<>();

    public Vehicule() {
        this.id = cpt++;
    }
    public Vehicule(String model, String marque, int annee, TypeCarburant carburant, Agence agence) {
        this();
        this.model = model;
        this.marque = marque;
        this.annee = annee;
        this.carburant = carburant;
        this.agence = agence;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }



    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public TypeCarburant getCarburant() {
        return carburant;
    }

    public void setCarburant(TypeCarburant carburant) {
        this.carburant = carburant;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public  List<Location> getLocations(){
        return locations;
    }

    @Override
    public String toString() {
        return "Vehicule{" +"model='" + model + ", marque='" + marque +", annee=" + annee +", carburant=" + carburant +", agence=" + agence +'}';
    }
}
