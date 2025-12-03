package repository;

import model.Location;

import java.util.ArrayList;

public class LocationRepository {
    private final ArrayList<Location> listeLocation = new ArrayList<>();

    //creer une location
    public Location save(Location location){
        listeLocation.add(location);
        return location ;
    }

    //afficher toutes les location
    public ArrayList<Location> getListeLocation(){
        return  listeLocation;
    }

    //supprimer une location pas Id
    public boolean delete(long Id){
        for (Location l : listeLocation){
            if (Id == l.getId()){
                listeLocation.remove(l);
                return  true;
            }
        }
        return  false;
    }

    //recherche location par Id
    public  Location findById(long Id){
        for (Location l : listeLocation){
            if (Id == l.getId()){
                return l;
            }
        }
        return  null;
    }

    //recherche par nombre de jours
    public  Location findByDay(int delais){
        for (Location l : listeLocation){
            if (delais == l.getNbJours()){
                return l;
            }
        }
        return  null;
    }
}
