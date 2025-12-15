package controller;

import model.Location;
import service.LocationService;

import java.util.NoSuchElementException;

public class LocationController {
    private  final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    public Location save(Location l){
        try {
            return locationService.save(l);
        }catch (IllegalAccessError e){
            System.err.println(e.getMessage());
        }

        return null;
    }

    public boolean deleteLocation(long Id){
        try {
            return locationService.delete(Id);
        }catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }
        return false ;
    }

    public Location finfByDay(int day){
        try {
            return locationService.findByDay(day);
        }catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
}
