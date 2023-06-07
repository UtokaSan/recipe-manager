package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe pour créer le Menu
 */
public class Menu {
    String name;
    List<MenuItem> items;
    Scanner scanner;
    LivreRecette livreRecette;

    /**
     * Constructeur Menu
     * @param name Nom du menu
     * @param livreRecette objet
     */
    public Menu(String name, LivreRecette livreRecette) {
        this.name = name;
        this.items = new ArrayList<>();
        this.livreRecette = livreRecette;
    }

    /**
     * Affiche un menu et demande à l'utilisateur un choix
     */
    public void displayAndWaitChoice() {
        this.scanner = new Scanner(System.in);
        boolean end = false;
        do {
            System.out.println(this.name);
            for(int i=0; i< items.size(); i++) {
                String line = String.format("%d - %s", i+1, this.items.get(i).getLabel());
                System.out.println(line);
            }
            System.out.print("Votre choix : ");
            try {
                int menuChoice = this.scanner.nextInt();
                if(menuChoice > 0) {
                    switch (menuChoice) {
                        case 1:
                            livreRecette.displayRecette();
                            break;
                        case 2:
                            livreRecette.ajouterRecette();
                            break;
                        case 3:
                            livreRecette.deleteRecette();
                            break;
                        case 4:
                            livreRecette.saveInFile();
                            break;
                        case 5:
                            livreRecette.readFileRecipe();
                            break;
                        case 6:
                            livreRecette.searchRecipe();
                            break;
                        case 7:
                            System.out.println("Arret du programme");
                            return;
                    }
                } else {
                    end = true;
                }
            }catch(Exception e) {
                System.out.println("Saisie invalide");
                e.printStackTrace();
            }
        }while(!end);
        this.scanner.close();
    }

    /**
     * Ajouter un item à menu afin de pouvoir ajouter des menus
     * @param item Objet item afin de rajouter l'item dans le tableau
     */
    public void addItem(MenuItem item) {
        items.add(item);
    }
}