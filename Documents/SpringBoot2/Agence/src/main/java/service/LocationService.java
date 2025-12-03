package service;

import model.Location;
import repository.LocationRepository;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LocationService {
    private LocationRepository locationsRepo ;

    public Location save(Location l){
        if (l == null){
            throw new IllegalArgumentException("Informations invalides.");
        }
        return locationsRepo.save(l) ;
    }

    public boolean delete(long Id){
        Location location = locationsRepo.findById(Id);
        if (location == null){
            throw new NoSuchElementException("Cet Location n'existe pas");
        }

        return  locationsRepo.delete(Id);
    }

    public Location findByDay(int delais){
        Location location = locationsRepo.findByDay(delais);

        if (location == null){
            throw new NoSuchElementException("Aucune location n'a pour nombre jours de location " + delais);
        }

        return locationsRepo.findByDay(delais);
    }


}
