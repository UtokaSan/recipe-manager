package org.example;

import java.util.HashMap;

/**
 * Application de base pour lancer
 */
public class App {
    /**
     * Méthode de lancement de l'application
     */
    void launch () {
        Menu menu = new Menu("Menu", new LivreRecette());
        menu.addItem(new MenuItem("Afficher recettes", "afficher recettes"));
        menu.addItem(new MenuItem("Ajouter recette", "ajouter recette"));
        menu.addItem(new MenuItem("Supprimer recette", "supprimer recette"));
        menu.addItem(new MenuItem("Sauvegarder dans un fichier", "sauvegarder fichier"));
        menu.addItem(new MenuItem("lire dans le fichier de recette", "lire fichier"));
        menu.addItem(new MenuItem("Rechercher dans les recettes", "rechercher recette"));
        menu.addItem(new MenuItem("Quitter", "quitter"));
        menu.displayAndWaitChoice();
    }
}