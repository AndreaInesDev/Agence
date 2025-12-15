package service;

import model.User;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class UserService {
    private final UserRepository userRepos;

    public UserService(UserRepository userRepos) {
        this.userRepos = userRepos;
    }


    public User save(User user){
        if (user.getFirstName().length() <= 3){
            throw new IllegalArgumentException("Impossible d'ajouter un utilisateur");
        }
        return userRepos.ajoutUser(user);
    }

    public  ArrayList<User> getAllUsers(){
        return userRepos.getAllUser();
    }

    public  User rechercheId(long Id){
        User user = userRepos.rechercheId(Id);
        if (user == null){
            throw new NoSuchElementException("Cet utilisateur est inexistant");
        }

        return userRepos.rechercheId(Id);
    }

    public User rechercheParNom(String nom){
        User user = userRepos.rechercheNom(nom);

        if (user == null){
            throw new NoSuchElementException(("Cet utilisateur n'existe pas"));
        }
        return userRepos.rechercheNom(nom);
    }

    public boolean supprimerUser(long Id){
        User user = userRepos.rechercheId(Id);
        if (user == null){
            throw new NoSuchElementException("Cet utilisateur ne figure pas dans cette liste");
        }
        userRepos.supprimerUser(Id);
        return true ;
    }
}
