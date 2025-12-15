package controller;

import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    public User save(User user){
        try {
            return userService.save(user);
        }catch (IllegalAccessError e){
            System.err.println(e.getMessage());
        }

        return  null;
    }

    public ArrayList<User> getAllUsers(){
        try {
            return userService.getAllUsers() ;
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

        return null ;
    }

    public  User findById(long Id){
        try {

            return userService.rechercheId(Id);
        }catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }

        return null;
    }

    public  User findByName(String name){
        try {
            return userService.rechercheParNom(name);
        }catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }
        return null ;
    }

    public boolean deleteUser(long Id){
        try {
            return userService.supprimerUser(Id);
        }catch (NoSuchElementException e){
            System.err.println(e.getMessage());
        }
        return  false;
    }


}
