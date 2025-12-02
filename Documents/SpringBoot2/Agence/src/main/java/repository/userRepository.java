package repository;

import model.User;

import java.util.ArrayList;

public class userRepository {

    private ArrayList<User> usersRepo = new ArrayList<>();


    //ajout d'un nouvel utilisateur et retoouner cet utilisateur
    public User ajoutUser(User users){
        usersRepo.add(users);
        return users;
    }


    //ajout d'un nouvel utilisateur et retoouner un booleen
    public boolean ajoutUserTrue(User users){
        usersRepo.add(users);
        return  true;
        //this.usersRepo.put(users.getId(), users); je ne comprends pas
    }

    //afficher tous les utilisateurs
    public  ArrayList<User> getAllUser(){
        return  usersRepo;
    }

    //filtre par l'Id
    public User rechercheId(long Id){

        //return this.usersRepo.get(Id);    je ne comprend pas
        for (User user : usersRepo){
            if (Id == user.getId()){
                return user;
            }
        }

        return null;
    }

    //filtre pas nom
    public  boolean rechercheNom(String nom){
        for (User user : usersRepo){
            if (user.getFirstName().equals(nom)){
                return true ;
            }
        }
        return false;
    }

    //supprimer un utilisateur par l'Id
    public String supprimerUser(long Id){
        for (User u : usersRepo){
            if (Id == u.getId()){
                usersRepo.remove(u);
                return "Utilisateur supprimé" ;
            }
        }
        return "L'utilisateur n'existe pas" ;
    }

    //recherche si la nom + id existe et retourner un booleen
    public boolean rechercheIdNom(long Id, String nom){
        for (User user : usersRepo){
            if (Id == user.getId() && user.getFirstName().equals(nom)){
                return true ;
            }
        }
        return false;
    }
}
