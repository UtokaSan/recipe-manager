package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Classe permettant de supprimer/ajouter/rechercher... des recettes
 */
public class LivreRecette {
    ArrayList<Recette> listeDeRecette = new ArrayList<Recette>();
    Scanner scanner = new Scanner(System.in);

    public LivreRecette() {}

    /**
     * Affiche le tableau dans lequel sont les recettes
     */
    void displayRecette () {
        for (Recette liste : listeDeRecette) {
            System.out.println(liste);
        }
    }

    /**
     * Ajoute une recette dans un tableau et des ingredient dans une liste
     */
    void ajouterRecette () {
        System.out.println("Nom de la recette : ");
        String nameRecette = this.scanner.nextLine();
        List<Ingredients> ingredientsList = new ArrayList<>();
        System.out.println("Nombre d'ingredient : ");
        Integer nombreIngredient = this.scanner.nextInt();
        this.scanner.nextLine();
        for (int i = 0; i < nombreIngredient; i++) {
            System.out.println("Nom de l'ingrédient " + (i + 1) + " : ");
            String nomIngredient = scanner.nextLine();
            System.out.println("Quantité de l'ingrédient " + (i + 1) + " : ");
            int quantiteIngredient = scanner.nextInt();
            scanner.nextLine();
            Ingredients ingredient = new Ingredients(quantiteIngredient, nomIngredient);
            ingredientsList.add(ingredient);
        }
        System.out.println("Type du plat : ");
        String typeDePlat = this.scanner.nextLine();
        System.out.println("Temps de préparation : ");
        String tempsDePreparation = this.scanner.nextLine();
        Recette recette = new Recette(nameRecette, ingredientsList, new TypePlat(typeDePlat), new TempsPreparation(tempsDePreparation));
        listeDeRecette.add(recette);
    }

    /**
     * Supprime une recette
     * @throws IOException Gère l'erreur si une recette ne peux pas être supprimé
     */
    void deleteRecette () throws Exception {
        System.out.println("Quelle recette souhaitez vous supprimer : ");
        String choiceDelete = this.scanner.nextLine();
        Iterator<Recette> iter = listeDeRecette.iterator();
        boolean isExist = false;
        while (iter.hasNext()) {
            Recette recette = iter.next();
            if (recette.getM_name().equalsIgnoreCase(choiceDelete)) {
                iter.remove();
                isExist = true;
            }
        }
        if (!isExist) {
            throw new Exception("La recette n'exite pas");
        }
    }

    /**
     * Sauvegarde la recette dans le fichier
     * @throws IOException Gère l'erreur si un fichier ne peux pas être sauvegarder
     */
    void saveInFile () throws IOException {
        String nameFile = "recipe.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile, true))) {
            for (Recette liste : listeDeRecette) {
                writer.newLine();
                writer.write(liste.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Problem with save file");
            e.printStackTrace();
        }
    }

    /**
     * Lis le fichier de la recette de cuisine
     */
    void readFileRecipe () {
        File file = new File("recipe.txt");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Problem with reader");
        }
    }

    /**
     * Cherche la recette
     * @throws Exception gère l'erreur si la recette n'existe pas
     */
    void searchRecipe() throws Exception {
        System.out.println("Entrer le nom de la recette à rechercher : ");
        String nameRecipe = this.scanner.nextLine();
        Iterator<Recette> iter = listeDeRecette.iterator();
        boolean isExist = false;
        while (iter.hasNext()) {
            Recette recette = iter.next();
            if (recette.getM_name().equalsIgnoreCase(nameRecipe)) {
                isExist = true;
                displayRecette();
            }
        }
        if (!isExist) {
            throw new Exception("La recette n'exite pas");
        }
    }
}