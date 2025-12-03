package repository;

import model.User;

import java.util.ArrayList;

public class UserRepository {

    private final ArrayList<User> listeUsers = new ArrayList<>();


    //ajout d'un nouvel utilisateur et retoouner cet utilisateur
    public User ajoutUser(User users){
        listeUsers.add(users);
        return users;
    }

    //afficher tous les utilisateurs
    public  ArrayList<User> getAllUser(){
        return  listeUsers;
    }

    //filtre par l'Id
    public User rechercheId(long Id){
        for (User user : listeUsers){
            if (Id == user.getId()){
                return user;
            }
        }

        return null;
    }

    //filtre pas nom
    public  User rechercheNom(String nom){
        for (User user : listeUsers){
            if (user.getFirstName().equals(nom)){
                return user ;
            }
        }
        return null;
    }

    //supprimer un utilisateur par l'Id
    public boolean supprimerUser(long Id){
        for (User u : listeUsers){
            if (Id == u.getId()){
                listeUsers.remove(u);
                return true;
            }
        }
        return false ;
    }

    //recherche si la nom + id existe et retourner un booleen
    public boolean existeParIdEtNom(long Id, String nom){
        for (User user : listeUsers){
            if (Id == user.getId() && user.getFirstName().equals(nom)){
                return true ;
            }
        }
        return false;
    }
}
