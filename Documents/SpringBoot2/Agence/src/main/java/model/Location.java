package model;

import java.util.ArrayList;

public class Location {
    private static long cpt = 0;

    private long id;
    private int nbJours;
    private User user;
    private ArrayList<Vehicule> vehiculeLoué = new ArrayList<>();

    public Location() {
        this.id = cpt++;
    }

    public Location(User user, Vehicule vehiculeLoué, int nbJours) {
        this();
        this.user = user;
        this.nbJours = nbJours;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void ajoutVehicule(Vehicule v){
        vehiculeLoué.add(v);
    }
    public ArrayList<Vehicule> getVehiculeLoué() {
        return vehiculeLoué;
    }

    public int getNbJours() {
        return nbJours;
    }

    public void setNbJours(int nbJours) {
        this.nbJours = nbJours;
    }

    @Override
    public String toString() {
        if (user == null || vehiculeLoué == null){
            return "Location invalide (client ou véhicule manquant)";
        }else {
            return "Location{" +" user=" + user + ", vehiculeLoué=" + vehiculeLoué + ", nbJours=" + nbJours +'}';
        }
    }
}
