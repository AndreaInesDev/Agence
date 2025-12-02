package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    private static long cpt = 0;

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private final List<Location> locations = new ArrayList<>();


    public User() {
        this.id = cpt++;
    }

    public User(String firstName, String lastName, int age) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static long getCpt() {
        return cpt;
    }

    public static void setCpt(long cpt) {
        User.cpt = cpt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void  ajouterLocation(Location l){
        locations.add(l);
    }

    public List<Location> getLocations(){
        return locations;
    }

    public void supprimerLocation(int id){
        for (Location local : locations){
            if (id == local.getId()){
                locations.remove(local);
            }
        }
    }

    @Override
    public String toString() {
        return "User{" + ", firstName='" + firstName +", lastName='" + lastName +", age=" + age +'}';
    }
}
